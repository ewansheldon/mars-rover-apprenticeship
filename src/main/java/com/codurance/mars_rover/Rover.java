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
                move(direction.getIndex());
            }
        }

        return x + ":" + y + ":" + direction.symbol();
    }

    private void move(int rCount) {

        if (rCount % 4 == 0) {
            y++;
        }
        if (rCount % 4 == 1) {
            x++;
        }
        if (rCount % 4 == 2) {
            y--;
        }
        if (rCount % 4 == 3) {
            x--;
        }
    }
}
