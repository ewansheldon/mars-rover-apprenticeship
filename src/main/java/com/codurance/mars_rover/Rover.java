package com.codurance.mars_rover;

public class Rover {
    private Direction direction;
    private int y;

    public Rover(Grid grid) {
        direction = new NorthDirection("N");
        y = 0;
    }

    public String execute(String input) {
        for (char command : input.toCharArray()) {
            if (command == 'M') {
                y++;
            }
            if (command == 'L') {
                direction = direction.turnLeft();
            }
            if (command == 'R') {
                direction = direction.turnRight();
            }
        }
        return "0:" + y + ":" + direction;
    }

}