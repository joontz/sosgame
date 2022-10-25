package com.example.sosgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    private Controller controller;
    @Test
    void testSizeValidator() {
        try {
            controller.sizeValidator(100);
        }
        catch(IllegalArgumentException e) {
            System.out.println("invalid input");
        }

            controller.sizeValidator(7);
            System.out.println("valid input");

    }
}