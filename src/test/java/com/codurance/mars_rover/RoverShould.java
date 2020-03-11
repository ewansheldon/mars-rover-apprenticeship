package com.codurance.mars_rover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverShould {

    private Rover rover;

    @BeforeEach
    void setUp() {
        rover = new Rover();
    }

    @Test
    void return_north_if_no_commands() {
        String response = rover.execute("");
        assertEquals("0:0:N", response);
    }

    @Test
    void return_east_if_right_command() {
        String response = rover.execute("R");
        assertEquals("0:0:E", response);
    }
}
