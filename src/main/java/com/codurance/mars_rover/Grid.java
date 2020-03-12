package com.codurance.mars_rover;

public class Grid {
    private final int width;
    private final int height;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void wrap(Coordinates coordinates) {
        if (coordinates.getY() < 0) {
            coordinates.setY(height - 1);
        }
        if (coordinates.getY() >= height) {
            coordinates.setY(0);
        }
        if (coordinates.getX() >= width) {
            coordinates.setX(0);
        }
        if (coordinates.getX() < 0) {
            coordinates.setX(width - 1);
        }
    }
}
