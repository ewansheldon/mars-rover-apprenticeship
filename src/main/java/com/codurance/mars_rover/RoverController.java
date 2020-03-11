package com.codurance.mars_rover;

import com.codurance.mars_rover.rover.Rover;
import com.codurance.mars_rover.rover.RoverNorth;

public class RoverController {
    private Rover rover;
    private Grid grid;

    public RoverController(Grid grid) {
        this.grid = grid;
        rover = new RoverNorth(0, 0);
    }

    public String execute(String commands) {
        for (char command : commands.toCharArray()) {
            if (command == 'R') {
                rover = rover.turnRight();
            }

            if (command == 'L') {
                rover = rover.turnLeft();
            }

            if (command == 'M') {

                rover = rover.move();
            }
        }

        return rover.getX() + ":" + rover.getY() + ":" + rover.symbol();
    }

}
