package com.codurance.mars_rover;

import com.codurance.mars_rover.rover.Rover;
import com.codurance.mars_rover.rover.RoverNorth;

public class RoverController {
    private Rover direction;
    private Grid grid;

    public RoverController(Grid grid) {
        this.grid = grid;
        direction = new RoverNorth(0, 0);
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
                direction = direction.move();
            }
        }

        return direction.getX() + ":" + direction.getY() + ":" + direction.symbol();
    }

}
