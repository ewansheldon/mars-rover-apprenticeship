package com.codurance.mars_rover;

public class WestDirection implements Direction {
    private static final String DIRECTION = "W";
    @Override
    public Direction turnLeft() {
        return new SouthDirection();
    }

    @Override
    public Direction turnRight() {
        return new NorthDirection();
    }

    @Override
    public String toString() {
        return DIRECTION;
    }

    @Override
    public int[] forward() {
        return new int[]{-1,0};
    }
}
