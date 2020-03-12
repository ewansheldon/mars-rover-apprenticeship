package com.codurance.mars_rover;

public class EastDirection implements Direction {
    private String direction;

    public EastDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public Direction turnLeft() {
        return new NorthDirection("N");
    }

    @Override
    public Direction turnRight() {
        return new SouthDirection("S");
    }

    @Override
    public String toString() {
        return direction;
    }
}
