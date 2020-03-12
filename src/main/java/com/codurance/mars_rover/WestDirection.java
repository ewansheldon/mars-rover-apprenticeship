package com.codurance.mars_rover;

public class WestDirection implements Direction {
    private final String direction;

    public WestDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public Direction turnLeft() {
        return new SouthDirection("S");
    }

    @Override
    public Direction turnRight() {
        return new NorthDirection("N");
    }

    @Override
    public String toString() {
        return direction;
    }

    @Override
    public int[] forward() {
        return new int[]{-1,0};
    }
}
