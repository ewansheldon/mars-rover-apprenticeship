package com.codurance.mars_rover;

public class South extends Direction {
    public South(int x, int y) {
        super(x, y);
    }

    public Direction turnRight() {
        return new West(x, y);
    }

    public String symbol() {
        return "S";
    }

    public Vector getMovementVector() {
        return new Vector(0, -1);
    }

    public Direction turnLeft() {
        return new East(x, y);
    }
}
