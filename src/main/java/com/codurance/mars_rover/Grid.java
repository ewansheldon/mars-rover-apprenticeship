package com.codurance.mars_rover;

public class Grid {
    private final int width;
    private final int height;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Coordinates wrap(Coordinates coordinates) {
        int newX = Math.floorMod(coordinates.getX(), width);
        int newY = Math.floorMod(coordinates.getY(), height);
        return new Coordinates(newX, newY);
    }
}
