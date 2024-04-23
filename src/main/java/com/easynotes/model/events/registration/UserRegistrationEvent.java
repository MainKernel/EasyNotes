package com.easynotes.model.events.registration;

import com.easynotes.model.entity.UserEntity;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;


@Getter
public class UserRegistrationEvent extends ApplicationEvent {
    private final UserEntity userEntity;
    public UserRegistrationEvent(UserEntity source) {
        super(source);
        this.userEntity = source;
    }

}
