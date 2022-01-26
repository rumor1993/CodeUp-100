package com.company.refactoring.ch1_magic_number;

public class App {
    public static void main(String[] args) {
        Robot robot = new Robot("Andrew");
        robot.order(0);
        robot.order(1);
        robot.order(2);

        System.out.println();

        RobotRefactor robotRefactor = new RobotRefactor("Andrew2");
        robotRefactor.order(RobotRefactor.COMMAND_WALK);
        robotRefactor.order(RobotRefactor.COMMAND_STOP);
        robotRefactor.order(RobotRefactor.COMMAND_JUMP);
    }
}
