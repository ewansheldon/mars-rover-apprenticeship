package com.codurance.mars_rover;

public class Grid {
    private final int width;
    private final int height;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Coordinates wrap(Coordinates coordinates) {
        if (coordinates.getY() < 0) {
            return new Coordinates(coordinates.getX(), height - 1);
        }
        if (coordinates.getY() >= height) {
            return new Coordinates(coordinates.getX(), 0);
        }
        if (coordinates.getX() >= width) {
            return new Coordinates(0, coordinates.getY());
        }
        if (coordinates.getX() < 0) {
            return new Coordinates(width - 1, coordinates.getY());
        }
        return coordinates;
    }
}
