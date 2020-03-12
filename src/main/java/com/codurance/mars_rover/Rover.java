package com.codurance.mars_rover;

public class Rover {
    private final Coordinates coordinates;
    private Direction direction;

    public Rover(Grid grid) {
        direction = new NorthDirection("N");
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

    private String formatOutput() {
        return coordinates.getX() + ":" + coordinates.getY() + ":" + direction;
    }

    private void move() {
        coordinates.update(direction.forward());
    }

}