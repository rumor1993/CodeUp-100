package com.company.refactoring.ch1_magic_number;

public class RobotRefactor {
    public static final RobotCommand COMMAND_WALK = new RobotCommand("WALK");
    public static final RobotCommand COMMAND_STOP = new RobotCommand("STOP");
    public static final RobotCommand COMMAND_JUMP = new RobotCommand("JUMP");

    private final String _name;

    public RobotRefactor(String name) {
        _name = name;
    }

    /**
     * @param command
     * 명령어 0 : 로봇이 걷습니다.
     * 명령어 1 : 로봇이 멈춥니다.
     * 명령어 2 : 로봇이 점프합니다.
     */

    public void order(RobotCommand command) {
        if (command == COMMAND_WALK) {
            System.out.println(_name + " walks.");
        } else if (command == COMMAND_STOP) {
            System.out.println(_name + " stops.");
        } else if (command == COMMAND_JUMP) {
            System.out.println(_name + " jumps.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }
}
