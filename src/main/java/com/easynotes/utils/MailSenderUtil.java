package com.easynotes.utils;


import com.easynotes.model.entity.UserEntity;
import com.easynotes.model.exceptions.VerificationCodeException;
import com.easynotes.model.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class MailSenderUtil {
    private UserService userService;
    private MailSender mailSender;
    private SimpleMailMessage templateMessage;
    private VerificationCodeGenerator codeGenerator;

    @Autowired
    private void loadDependencies(VerificationCodeGenerator codeGenerator, UserService userService) {
        this.codeGenerator = codeGenerator;
        this.userService = userService;
    }

    public String SendVerificationCode(String email, String username) throws VerificationCodeException {
        String code = codeGenerator.verificationCode();
        SimpleMailMessage msg = new SimpleMailMessage(this.templateMessage);
        msg.setTo(email);
        msg.setText(
                username.toUpperCase() +
                " this is you`r email verification code: " + code
        );

        try {
            this.mailSender.send(msg);
            return code;

        }catch (MailException ex) {
            // TODO make logging
            log.info("SendVerificationCode method error");
        }
        // Throw exception on sending error
        throw new VerificationCodeException("Error during verification code sending");
    }

    public String forgottenPasswordVerificationCode(String email) throws VerificationCodeException {
        String code = codeGenerator.verificationCode();
        if (isUserEmailExists(email)) {
            SimpleMailMessage msg = new SimpleMailMessage(this.templateMessage);
            msg.setTo(email);
            msg.setText(
                    "Your verification code: " + code
            );
            try {
                this.mailSender.send(msg);
                return code;
            }
            catch (MailException ex) {
                // TODO make logging
                log.info("Send forgottenPasswordVerificationCodeError");
            }
        }
        // Throw exception on sending error
        throw new VerificationCodeException("Error during verification code sending");
    }

    private boolean isUserEmailExists(String email) {
        try {
            UserEntity userByEmail = userService.getUserByEmail(email);
            return true;
        } catch (UsernameNotFoundException exception) {
            log.info("Exception during finding user by email, can be ignored because email doesnt exists");
        }
        return false;
    }

}
