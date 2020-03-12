package com.codurance.mars_rover;

public class NorthDirection implements Direction {
    private static final String DIRECTION = "N";

    @Override
    public Direction turnLeft() {
        return new WestDirection();
    }

    @Override
    public Direction turnRight() {
        return new EastDirection();
    }

    @Override
    public String toString() {
        return DIRECTION;
    }

    @Override
    public int[] forward() {
        return new int[]{0,1};
    }
}
