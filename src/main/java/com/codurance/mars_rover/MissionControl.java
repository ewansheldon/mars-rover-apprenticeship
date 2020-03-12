package com.codurance.mars_rover;

public class MissionControl {
    private final Rover rover;

    public MissionControl(Rover rover) {
        this.rover = rover;
    }

    public String execute(String input) {
        for (char command : input.toCharArray()) {
            if (command == 'M') {
                rover.move();
            }
            if (command == 'L') {
                rover.turnLeft();
            }
            if (command == 'R') {
                rover.turnRight();
            }
        }
        return rover.formatOutput();
    }
}