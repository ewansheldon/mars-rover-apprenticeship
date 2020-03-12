package com.codurance.mars_rover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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

    @Test
    void move_to_01N_with_M() {
        String output = rover.execute("M");
        assertEquals("0:1:N", output);
    }
    @Test
    void move_to_02N_with_MM() {
        String output = rover.execute("MM");
        assertEquals("0:2:N", output);
    }
    @Test
    void move_to_03N_with_MMM() {
        String output = rover.execute("MMM");
        assertEquals("0:3:N", output);
    }
}
