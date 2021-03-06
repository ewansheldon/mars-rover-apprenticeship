package com.codurance.mars_rover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverShould {

    private RoverController rover;



    @BeforeEach
    void setUp() {
        Grid grid = new Grid(0, 0);
        rover = new RoverController(grid);
    }

    @ParameterizedTest
    @CsvSource({
            "'', 0:0:N",
            "R, 0:0:E",
            "RR, 0:0:S",
            "RRR, 0:0:W",
            "RRRR, 0:0:N",
            "RRRRR, 0:0:E",
            "RRRRRR, 0:0:S"
    })
    void turn_rover_right(String commands, String expectedPosition) {
        String position = rover.execute(commands);
        assertEquals(expectedPosition, position);
    }

    @ParameterizedTest
    @CsvSource({
            "M, 0:1:N",
            "MM, 0:2:N",
            "MMM, 0:3:N",
    })
    void move_rover(String commands, String expectedPosition) {
        String position = rover.execute(commands);
        assertEquals(expectedPosition, position);
    }

    @ParameterizedTest
    @CsvSource({
            "MR, 0:1:E",
            "RM, 1:0:E",
            "MMRRM, 0:1:S",
            "RMMRRM, 1:0:W"
    })
    void turn_and_move(String commands, String expectedPosition) {
        String position = rover.execute(commands);
        assertEquals(expectedPosition, position);
    }

    @ParameterizedTest
    @CsvSource({
            "L, 0:0:W",
            "LL, 0:0:S",
            "LLL, 0:0:E",
            "LLLL, 0:0:N",
            "LLLLL, 0:0:W"
    })
    void turn_rover_left(String commands, String expectedPosition) {
        String position = rover.execute(commands);
        assertEquals(expectedPosition, position);
    }

    @ParameterizedTest
    @CsvSource({
            "MMMMMMMMMM, 0:0:N",
    })
    void wraps_around_the_board(String commands, String expectedPosition) {
        String position = rover.execute(commands);
        assertEquals(expectedPosition, position);
    }
}
