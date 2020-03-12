package com.codurance.mars_rover;

public class EastDirection implements Direction {
    private static final String DIRECTION = "E";

    @Override
    public Direction turnLeft() {
        return new NorthDirection();
    }

    @Override
    public Direction turnRight() {
        return new SouthDirection();
    }

    @Override
    public String toString() {
        return DIRECTION;
    }

    @Override
    public int[] forward() {
        return new int[]{1,0};
    }
}
