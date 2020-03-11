package com.codurance.mars_rover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverShould {

    private Rover rover;

    @BeforeEach
    void setUp() {
        rover = new Rover();
    }

    @ParameterizedTest
    @CsvSource({
            "'', 0:0:N",
            "R, 0:0:E",
            "RR, 0:0:S",
            "RRR, 0:0:W",
            "RRRR, 0:0:N"
    })
    void turn_rover_right(String commands, String expectedPosition) {
        String position = rover.execute(commands);
        assertEquals(expectedPosition, position);
    }
}
