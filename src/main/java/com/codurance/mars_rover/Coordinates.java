package com.codurance.mars_rover;

public class Coordinates {
    private int y;
    private int x;

    public Coordinates(int y, int x) {
        this.y = y;
        this.x = x;
    }

    void update(int[] movementVector) {
        x = getX() + movementVector[0];
        y = getY() + movementVector[1];
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
}