package com.codurance.mars_rover;

public class NorthDirection implements Direction {
    private String direction;

    public NorthDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public Direction turnLeft() {
        return new WestDirection("W");
    }

    @Override
    public String toString() {
        return direction;
    }
}
