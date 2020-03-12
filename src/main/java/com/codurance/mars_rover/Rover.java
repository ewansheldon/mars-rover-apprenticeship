package com.codurance.mars_rover;

public class Rover {
    private Coordinates coordinates;
    private Direction direction;
    private Grid grid;

    public Rover(Grid grid) {
        this.grid = grid;
        direction = new NorthDirection();
        coordinates = new Coordinates(0, 0);
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void move() {
        coordinates = grid.wrap(coordinates.update(direction.forward()));
    }

    public String formatOutput() {
        return coordinates.getX() + ":" + coordinates.getY() + ":" + direction;
    }


}