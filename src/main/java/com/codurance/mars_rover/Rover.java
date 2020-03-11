package com.codurance.mars_rover;

public class Rover {

    private int y;
    private int x;
    private Direction direction;

    public Rover() {
        y = 0;
        x = 0;
        direction = new North(x,y);
    }

    public String execute(String commands) {
        for (char command : commands.toCharArray()) {
            if (command == 'R') {
                direction = direction.turnRight();
            }

            if (command == 'L') {
                direction = direction.turnLeft();
            }

            if (command == 'M') {
                direction.move();
            }
        }

        return direction.getX() + ":" + direction.getY() + ":" + direction.symbol();
    }

}
