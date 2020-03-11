package com.codurance.mars_rover;

public class Rover {
    public String execute(String commands) {
        int y = 0;
        int rCount = 0;

        for (int i = 0; i < commands.length() ; i++) {
            if (commands.charAt(i) == 'R'){
                rCount ++;
            }
            if (commands.charAt(i) == 'M'){
                y ++;
            }
        }

        String[] directions = new String[]{"N", "E", "S", "W"};
        String direction = directions[rCount % 4];

        return "0:"+ y + ":" + direction;
    }
}
