package com.company.refactoring.ch1_magic_number;

public class RobotRefactor {
    private final String _name;
    public enum Command {
        WALK,
        STOP,
        JUMP
    }

    public RobotRefactor(String name) {
        _name = name;
    }

    public void order(Command command) {
        if (command == Command.WALK) {
            System.out.println(_name + " walks.");
        } else if (command == Command.STOP) {
            System.out.println(_name + " stops.");
        } else if (command == Command.JUMP) {
            System.out.println(_name + " jumps.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }
}
