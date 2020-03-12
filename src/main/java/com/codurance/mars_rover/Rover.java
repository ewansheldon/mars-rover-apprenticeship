package com.codurance.mars_rover;

public class Rover {
    private Direction direction;
    private int y;

    public Rover(Grid grid) {
        direction = new Direction("N");
        y = 0;
    }

    public String execute(String input) {
        for (char command : input.toCharArray()) {
            if (command == 'M') {
                y++;
            }
            if (command == 'L') {
                direction.turnLeft();
            }
        }
        return "0:" + y + ":" + direction;
    }

}