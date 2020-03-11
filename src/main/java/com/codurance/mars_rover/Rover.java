package com.codurance.mars_rover;

public class Rover {
    public String execute(String commands) {
        int y = 0;

        for (int i = 0; i < commands.length() ; i++) {
            if (commands.charAt(i) == 'M'){
                y += 1;
            }
        }

        String direction = "N";
        if (!commands.contains("M")){
            String[] directions = new String[]{"N", "E", "S", "W"};
            direction = directions[commands.length() % 4];
        }

        return "0:"+ y + ":" + direction;
    }
}
