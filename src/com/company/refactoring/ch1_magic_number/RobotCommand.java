package com.company.refactoring.ch1_magic_number;

public class RobotCommand {
    private final String _name;

    public RobotCommand(String _name) {
        this._name = _name;
    }

    @Override
    public String toString() {
        return "RobotCommand{" +
                "_name='" + _name + '\'' +
                '}';
    }
}
