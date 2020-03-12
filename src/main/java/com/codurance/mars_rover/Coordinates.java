package com.codurance.mars_rover;

public class Coordinates {
    int y;
    int x;

    public Coordinates(int y, int x) {
        this.y = y;
        this.x = x;
    }

    void update(int[] movementVector) {
        x = x + movementVector[0];
        y = y + movementVector[1];
    }
}