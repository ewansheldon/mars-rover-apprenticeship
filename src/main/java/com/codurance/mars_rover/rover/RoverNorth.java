package com.codurance.mars_rover.rover;

public class RoverNorth extends Rover {
    public RoverNorth(int x, int y) {
        super(x, y);
    }

    public Rover turnRight() {
        return new RoverEast(x, y);
    }

    public String symbol() {
        return "N";
    }

    public Rover turnLeft() {
        return new RoverWest(x, y);
    }

    public RoverNorth move() {
        return new RoverNorth(x, y + 1);
    }
}
