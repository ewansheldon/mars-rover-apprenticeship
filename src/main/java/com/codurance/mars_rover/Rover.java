package com.codurance.mars_rover;

public class Rover {
    public String execute(String commands) {
        String[] directions = new String[]{"N", "E", "S", "W", "N"};
        String direction = directions[commands.length()];

        return "0:0:" + direction;
    }
}
