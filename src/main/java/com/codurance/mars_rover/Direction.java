package com.codurance.mars_rover;

public class Direction {
    private String direction;

    public Direction(String direction) {
        this.direction = direction;
    }

    public void turnLeft() {
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

    @Override
    public String toString() {
        return direction;
    }
}
