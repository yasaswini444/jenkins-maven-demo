package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void shouldReturnWelcomeMessage() {
        String actualMessage = App.getMessage();

        String expectedMessage =
                "Hello, Jenkins and Maven! Welcome to CI/CD.";

        assertEquals(expectedMessage, actualMessage);
    }
}