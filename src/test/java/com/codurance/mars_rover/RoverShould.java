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
}
