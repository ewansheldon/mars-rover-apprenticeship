package com.codurance.mars_rover.rover;

import com.codurance.mars_rover.Vector;

public class RoverWest extends Rover {
    public RoverWest(int x, int y) {
        super(x, y);
    }

    public Rover turnRight() {
        return new RoverNorth(x, y);
    }

    public String symbol() {
        return "W";
    }

    public Rover turnLeft() {
        return new RoverSouth(x, y);
    }

    public RoverWest move() {
        return new RoverWest(x - 1, y);
    }
}
