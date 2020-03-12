package com.codurance.mars_rover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverShould {

    private Grid grid;
    private Rover rover;

    @BeforeEach
    void setUp() {
        grid = new Grid(10, 10);
        rover = new Rover(grid);
    }

    @ParameterizedTest
    @CsvSource({
            "L, 0:0:W",
            "LL, 0:0:S",
            "LLL, 0:0:E",
    })
    void rotate_left(String input, String expectedOutput) {
        String output = rover.execute(input);
        assertEquals(expectedOutput, output);
    }
}
