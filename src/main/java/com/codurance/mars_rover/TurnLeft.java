package com.codurance.mars_rover;

public class TurnLeft implements Command {
    private final Rover rover;

    public TurnLeft(Rover rover) {
        this.rover = rover;
    }

    public void execute() {
        rover.turnLeft();
    }
}