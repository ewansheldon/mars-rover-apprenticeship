package com.codurance.mars_rover.rover;

import com.codurance.mars_rover.Vector;

public class RoverEast extends Rover {
    public RoverEast(int x, int y) {
        super(x, y);
    }

    public Rover turnRight() {
        return new RoverSouth(x, y);
    }

    public String symbol() {
        return "E";
    }

    public Rover turnLeft() {
        return new RoverNorth(x, y);
    }

    public RoverEast move() {
        return new RoverEast(x + 1, y);
    }
}
