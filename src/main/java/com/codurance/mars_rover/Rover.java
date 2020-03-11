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
                if (rCount % 2 == 0) {
                    y++;
                } else {
                    x++;
                }
            }
        }

        String[] directions = new String[]{"N", "E", "S", "W"};
        String direction = directions[rCount % 4];

        return x + ":" + y + ":" + direction;
    }
}
