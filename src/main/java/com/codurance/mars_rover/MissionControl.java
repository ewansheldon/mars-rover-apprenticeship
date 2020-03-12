package com.codurance.mars_rover;

public class MissionControl {
    private final Rover rover;
    private CommandDispatcher commandDispatcher;

    public MissionControl(Rover rover) {
        this.rover = rover;
        this.commandDispatcher = new CommandDispatcher(rover);
    }

    public String execute(String input) {
        for (char command : input.toCharArray()) {
            commandDispatcher.getCommand(command).execute();
        }

        return rover.formatOutput();
    }
}