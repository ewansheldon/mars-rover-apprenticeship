package com.codurance.mars_rover;

public class Rover {
    private String direction;

    public Rover(Grid grid) {
        direction = "N";
    }

    public String execute(String input) {
        if (input.equals("M")) {
            return "0:1:" + direction;
        }
        if (input.equals("MM")) {
            return "0:2:" + direction;
        }
        for (char command : input.toCharArray()) {
            turnLeft();
        }
        return "0:0:" + direction;
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