package com.easynotes.model.listner;

import com.easynotes.model.events.registration.UserRegistrationEvent;
import com.easynotes.model.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRegistrationListener {
    private final UserService userService;

    @EventListener
    public void accept(UserRegistrationEvent event) {
        userService.registerUser(event.getUserEntity());
    }
}
