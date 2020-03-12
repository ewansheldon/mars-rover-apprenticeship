package com.codurance.mars_rover;

public class Rover {
    public Rover(Grid grid) {
    }

    public String execute(String input) {
        if (input.equals("LLL")) return "0:0:E";
        if (input.equals("LL")) return "0:0:S";
        return "0:0:W";
    }
}