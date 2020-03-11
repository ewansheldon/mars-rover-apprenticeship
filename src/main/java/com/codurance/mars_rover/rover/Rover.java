package com.codurance.mars_rover.rover;

import com.codurance.mars_rover.Grid;

public abstract class Rover {
    int x;
    int y;

    Rover(int x, int y) {
        this.x = x % 10;
        this.y = y % 10;
    }

    public abstract Rover turnRight();

    public abstract String symbol();

    public abstract Rover turnLeft();

    public abstract Rover move();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}