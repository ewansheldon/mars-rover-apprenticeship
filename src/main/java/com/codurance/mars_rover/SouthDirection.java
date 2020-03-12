package com.codurance.mars_rover;

public class SouthDirection implements Direction {
    private static final String DIRECTION = "S";
    @Override
    public Direction turnLeft() {
        return new EastDirection();
    }

    @Override
    public Direction turnRight() {
        return new WestDirection();
    }

    @Override
    public String toString() {
        return DIRECTION;
    }

    @Override
    public int[] forward() {
        return new int[]{0,-1};
    }
}
