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
            "LLLL, 0:0:N"
    })
    void rotate_left(String input, String expectedOutput) {
        String output = rover.execute(input);
        assertEquals(expectedOutput, output);
    }

    @ParameterizedTest
    @CsvSource({
            "R, 0:0:E",
            "RR, 0:0:S",
            "RRR, 0:0:W",
            "RRRR, 0:0:N"
    })
    void rotate_right(String input, String expectedOutput) {
        String output = rover.execute(input);
        assertEquals(expectedOutput, output);
    }

    @ParameterizedTest
    @CsvSource({
            "M, 0:1:N",
            "MM, 0:2:N",
            "MMM, 0:3:N"
    })
    void move_only_in_N_direction(String input, String expectedOutput){
        String output = rover.execute(input);
        assertEquals(expectedOutput, output);
    }

    @Test
    void turns_right_and_moves_when_RM() {
        String output = rover.execute("RM");
        assertEquals("1:0:E", output);
    }

    @Test
    void position_00S_on_input_MRRM() {
        String output = rover.execute("MRRM");
        assertEquals("0:0:S", output);
    }

    @Test
    void position_00W_on_input_RMRRM() {
        String output = rover.execute("RMRRM");
        assertEquals("0:0:W", output);
    }

    @Test
    void position_09S_RRM() {
        String output = rover.execute("RRM");
        assertEquals("0:9:S", output);
    }
    @Test
    void position_00N_MMMMMMMMM() {
        String output = rover.execute("MMMMMMMMMM");
        assertEquals("0:0:N", output);
    }
}
