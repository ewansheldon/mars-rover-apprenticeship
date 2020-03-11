package com.codurance.mars_rover;

public class Rover {

    private int y;
    private int x;

    public Rover() {
        y = 0;
        x = 0;
    }

    public String execute(String commands) {
        int rCount = 0;

        for (char command : commands.toCharArray()) {
            if (command == 'R') {
                rCount++;
            }
            if (command == 'M') {
                move(rCount);
            }
        }

        String[] directions = new String[]{"N", "E", "S", "W"};
        String direction = directions[rCount % 4];

        return x + ":" + y + ":" + direction;
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
