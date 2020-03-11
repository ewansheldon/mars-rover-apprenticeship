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
            "RM, 1:0:E"
    })
    void turn_and_move(String commands, String expectedPosition) {
        String position = rover.execute(commands);
        assertEquals(expectedPosition, position);
    }

//    @ParameterizedTest
//    @CsvSource({
//            "L, 0:0:W",
////            "LL, 0:0:S",
////            "LLL, 0:0:E",
////            "LLLL, 0:0:N"
//    })
//    void turn_rover_left(String commands, String expectedPosition) {
//        String position = rover.execute(commands);
//        assertEquals(expectedPosition, position);
//    }
}
