package com.codurance.mars_rover.rover;

import com.codurance.mars_rover.Vector;

public class RoverSouth extends Rover {
    public RoverSouth(int x, int y) {
        super(x, y);
    }

    public Rover turnRight() {
        return new RoverWest(x, y);
    }

    public String symbol() {
        return "S";
    }

    public Rover turnLeft() {
        return new RoverEast(x, y);
    }

    public RoverSouth move() {
        return new RoverSouth(x, y - 1);
    }
}
