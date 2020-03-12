package com.codurance.mars_rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverShould {
    @Test
    void rotate_left() {
        Grid grid = new Grid(10, 10);
        Rover rover = new Rover(grid);
        String output = rover.execute("L");
        assertEquals("0:0:W", output);
    }

    @Test
    void rotate_left_twice() {
        Grid grid = new Grid(10, 10);
        Rover rover = new Rover(grid);
        String output = rover.execute("LL");
        assertEquals("0:0:S", output);
    }

    @Test
    void rotate_left_three_times() {
        Grid grid = new Grid(10, 10);
        Rover rover = new Rover(grid);
        String output = rover.execute("LLL");
        assertEquals("0:0:E", output);
    }
}
