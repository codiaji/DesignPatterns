package io.motassadderoon;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private final Map<String, Command> commandMap = new HashMap<>();
    private Command lastExecutedCommand;

    public void addCommand(String commandName, Command command) {
        commandMap.put(commandName, command);
    }

    public void pressButton(String commandName) {
        Command command = commandMap.get(commandName);
        if (command != null) {
            command.execute();
            lastExecutedCommand = command;
        }
    }

    public void undoLastCommand() {
        if (lastExecutedCommand != null) {
            lastExecutedCommand.undo();
        }
    }

    public void redoLastCommand() {
        if (lastExecutedCommand != null) {
            lastExecutedCommand.execute();
        }
    }
}
