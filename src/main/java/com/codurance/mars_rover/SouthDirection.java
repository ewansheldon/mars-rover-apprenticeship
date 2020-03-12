package com.codurance.mars_rover;

public class SouthDirection implements Direction {
    private String direction;

    public SouthDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public Direction turnLeft() {
        return new EastDirection("E");
    }

    @Override
    public String toString() {
        return direction;
    }
}
