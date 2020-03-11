package com.codurance.mars_rover;

public class Rover {

    private int y;
    private int x;
    private Direction direction;

    public Rover() {
        y = 0;
        x = 0;
        direction = new NorthDirection();
    }

    public String execute(String commands) {
        for (char command : commands.toCharArray()) {
            if (command == 'R') {
                direction = direction.turnRight();
            }

            if (command == 'M') {
                move();
            }
        }

        return x + ":" + y + ":" + direction.symbol();
    }

    private void move() {

        if (direction.symbol() == "N") {
            y++;
        }
        if (direction.symbol() == "E") {
            x++;
        }
        if (direction.symbol() == "S") {
            y--;
        }
        if (direction.symbol() == "W") {
            x--;
        }
    }
}
