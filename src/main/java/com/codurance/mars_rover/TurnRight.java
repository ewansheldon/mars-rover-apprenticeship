package com.codurance.mars_rover;

public class TurnRight {
    private Rover rover;

    public TurnRight(Rover rover) {
        this.rover = rover;
    }

    public void execute() {
        rover.turnRight();
    }
}
