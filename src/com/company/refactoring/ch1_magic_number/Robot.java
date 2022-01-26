package com.company.refactoring.ch1_magic_number;

public class Robot {
    private final String _name;

    public Robot(String name) {
        _name = name;
    }

    /**
     * @param command
     * 명령어 0 : 로봇이 걷습니다.
     * 명령어 1 : 로봇이 멈춥니다.
     * 명령어 2 : 로봇이 점프합니다.
     */

    public void order(int command) {
        if (command == 0) {
            System.out.println(_name + " walks.");
        } else if (command == 1) {
            System.out.println(_name + " stops.");
        } else if (command == 2) {
            System.out.println(_name + " jumps.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }
}
