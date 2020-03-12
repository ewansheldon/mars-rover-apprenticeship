package com.codurance.mars_rover;

public class Rover {
    private Direction direction;
    private int y;
    private int x;

    public Rover(Grid grid) {
        direction = new NorthDirection("N");
        y = 0;
        x = 0;
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
        return x + ":" + y + ":" + direction;
    }

    private void move() {
        if (direction instanceof NorthDirection) {
            y++;
        }
        if (direction instanceof EastDirection) {
            x++;
        }
        if (direction instanceof SouthDirection) {
            y--;
        }
        if (direction instanceof WestDirection) {
            x--;
        }
    }

}