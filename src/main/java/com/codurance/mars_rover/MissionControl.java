package com.codurance.mars_rover;

public class MissionControl {
    private final Rover rover;

    public MissionControl(Rover rover) {
        this.rover = rover;
    }

    public String execute(String input) {
        for (char command : input.toCharArray()) {
            if (command == 'M') {
                new MoveCommand(rover).execute();
            }
            if (command == 'L') {
                new TurnLeft(rover).execute();
            }
            if (command == 'R') {
                new TurnRight(rover).execute();
            }
        }
        return rover.formatOutput();
    }
}