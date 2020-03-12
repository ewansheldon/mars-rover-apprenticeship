package com.codurance.mars_rover;

public class Rover {
    private String direction;
    private int y;

    public Rover(Grid grid) {
        direction = "N";
        y = 0;
    }

    public String execute(String input) {
        for (char command : input.toCharArray()) {
            if (command == 'M') {
                y++;
            }
            if (command == 'L') {
                turnLeft();
            }
        }
        return "0:" + y + ":" + direction;
    }

    private void turnLeft() {
        if (direction.equals("N")) {
            direction = "W";
        } else if (direction.equals("W")) {
            direction = "S";
        } else if (direction.equals("S")) {
            direction = "E";
        } else if (direction.equals("E")) {
            direction = "N";
        }
    }
}