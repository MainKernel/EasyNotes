package com.easynotes.utils;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

@Component
public class VerificationCodeGenerator {
    /// Template for verification code
    private static final String codeTemplate = "0.0.0.0.0.0.0.0";

    /**
     * Method used to generate one time verification code for various verifications
     * email conformations, or verification code for login
     * */
    public String verificationCode() {
        return Arrays.stream(codeTemplate.split("\\.")).map(e -> {
            int i = new Random().nextInt(10);
            e = String.valueOf(i);
            return e;
        }).collect(Collectors.joining());
    }

}
