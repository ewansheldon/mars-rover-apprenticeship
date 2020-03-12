package com.codurance.mars_rover;

public class Grid {
    private final int width;
    private final int height;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Coordinates wrap(Coordinates coordinates) {
        int newX = wrapBoundary(coordinates.getX(), width);
        int newY = wrapBoundary(coordinates.getY(), height);
        return new Coordinates(newX, newY);
    }

    private int wrapBoundary(int coordinate, int boundary) {
        return coordinate < 0 ? boundary - 1 : coordinate % boundary;
    }
}
