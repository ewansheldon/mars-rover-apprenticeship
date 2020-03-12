package com.codurance.mars_rover;

public class Rover {
    private final Coordinates coordinates;
    private Direction direction;
    private Grid grid;

    public Rover(Grid grid) {
        this.grid = grid;
        direction = new NorthDirection();
        coordinates = new Coordinates(0,0);
    }

    public String execute(String input) {
        for (char command : input.toCharArray()) {
            if (command == 'M') {
                move();
            }
            if (command == 'L') {
                turnLeft();
            }
            if (command == 'R') {
                turnRight();
            }
        }
        return formatOutput();
    }

    private void turnRight() {
        direction = direction.turnRight();
    }

    private void turnLeft() {
        direction = direction.turnLeft();
    }

    private void move() {
        coordinates.update(direction.forward());
        grid.wrap(coordinates);
    }

    private String formatOutput() {
        return coordinates.getX() + ":" + coordinates.getY() + ":" + direction;
    }


}