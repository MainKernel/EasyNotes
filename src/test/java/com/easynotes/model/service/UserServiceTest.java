package com.easynotes.model.service;

import com.easynotes.anotation.IT;
import com.easynotes.database.IntegrationTestsDatabase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
@IT
class UserServiceTest extends IntegrationTestsDatabase {
    @Autowired
    private UserService userService;

    @Test
    public void testThatUserFoundInDatabase() {

    }

}