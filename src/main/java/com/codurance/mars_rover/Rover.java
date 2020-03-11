package com.codurance.mars_rover;

public class Rover {
    public String execute(String commands) {
        if (commands.equals("R")) {
            return "0:0:E";
        }
        return "0:0:N";
    }
}
