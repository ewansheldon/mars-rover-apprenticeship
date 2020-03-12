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
                direction = direction.turnLeft();
            }
            if (command == 'R') {
                direction = direction.turnRight();
            }
        }
        return coordinates.x + ":" + coordinates.y + ":" + direction;
    }

    private void move() {
        coordinates.update(direction.forward());
    }

}