package com.codurance.mars_rover;

public class TurnRight implements Command {
    private Rover rover;

    public TurnRight(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnRight();
    }
}
