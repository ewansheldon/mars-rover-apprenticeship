package com.codurance.mars_rover;

public class North extends Direction {
    public North(int x, int y) {
        super(x, y);
    }

    public Direction turnRight() {
        return new East(x, y);
    }

    public String symbol() {
        return "N";
    }

    public Vector getMovementVector() {
        return new Vector(0, 1);
    }

    public Direction turnLeft() {
        return new West(x, y);
    }

    public North move() {
        Vector vector = getMovementVector();
        return new North(x + vector.getX(), y + vector.getY());
    }
}
