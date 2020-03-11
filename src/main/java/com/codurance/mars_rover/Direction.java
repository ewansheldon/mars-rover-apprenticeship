package com.codurance.mars_rover;

public abstract class Direction {
    protected int x;
    protected int y;

    public Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract Direction turnRight();

    public abstract String symbol();

    public abstract Vector getMovementVector();

    public abstract Direction turnLeft();

    void move() {
        Vector vector = getMovementVector();
        x += vector.getX();
        y += vector.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}