package com.easynotes.database;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
/**
 * @author mightyloot
 * abstract class for each test class
 * all test classes must extendes from this class
 * */
@SpringBootTest
@Testcontainers
@DirtiesContext
public abstract class IntegrationTestsDatabase {
    // PostgreSQL container
    // docker image 16.2, because postgres:latest can be a source of unstable work and exceptions
    @Container
    private static final PostgreSQLContainer<?> container = new PostgreSQLContainer<>("postgres:16.2");

    @BeforeAll
    public static void runContainer() {
        container.start();
    }

    /**
     * Using dynamic properties to get database url for tests
     * */
    @DynamicPropertySource
    public static void postgresProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", container::getJdbcUrl);
        registry.add("spring.liquibase.url", container::getJdbcUrl);
    }


    @AfterAll
    public static void stopContainer() {
        container.stop();
    }
}
