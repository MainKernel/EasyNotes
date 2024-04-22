package com.easynotes.model.service;

import com.easynotes.anotation.IT;
import com.easynotes.database.IntegrationTestsDatabase;
import com.easynotes.model.entity.UserEntity;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@IT
class UserServiceTest extends IntegrationTestsDatabase {
    @Autowired
    private UserService userService;

    @Test
    public void testThatUserFoundInDatabase() {
        UserEntity expected = UserEntity.builder()
                .id(1)
                .firstName("John")
                .lastName("Doe")
                .userTimeZone("UTC")
                .username("johndoe")
                .email("johndoe@example.com")
                .phoneNumber("+1234567890")
                .password("hashed_password")
                .role(UserEntity.Role.USER)
                .isAccountNonExpired(true)
                .isAccountNonLocked(true)
                .isCredentialsNonExpired(true)
                .isEnabled(true)
                .build();

        UserEntity actual = userService.getUserByUsername(expected.getUsername());

        Assertions.assertEquals(expected, actual);

    }

    @DisplayName("userNotFound")
    @Test
    public void testThatUserNotFound() {
        String notValidUsername = "SuperMegaUser";

        Assertions.assertThrows(UsernameNotFoundException.class,
                () -> userService.getUserByUsername(notValidUsername));
    }

}