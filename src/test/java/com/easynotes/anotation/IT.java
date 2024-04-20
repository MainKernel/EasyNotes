package com.easynotes.anotation;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * @author mightyloot
 *
 * Integration test anotation, just for greater convenience in testing
 *
 * */
@SpringBootTest
@Profile("test")
@PropertySource("classpath:application.properties")
public @interface IT {
}
