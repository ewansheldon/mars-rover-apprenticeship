package com.codurance.mars_rover;

import java.util.Map;

public class CommandDispatcher {
    private Map<Character, Command> commands;
    private Rover rover;

    public CommandDispatcher(Rover rover) {
        this.rover = rover;
        createCommands();
    }

    private void createCommands() {
        commands = Map.of(
                'M', new MoveCommand(rover),
                'L', new TurnLeft(rover),
                'R', new TurnRight(rover)
        );
    }

    public Command getCommand(char command) {
        return commands.get(command);
    }
}
