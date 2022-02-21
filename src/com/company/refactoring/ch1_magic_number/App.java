package com.company.refactoring.ch1_magic_number;

public class App {
    public static void main(String[] args) {
        Robot robot = new Robot("Andrew");
        robot.order(0);
        robot.order(1);
        robot.order(2);

        System.out.println();

        RobotRefactor robotRefactor = new RobotRefactor("Andrew2");
        robotRefactor.order(RobotRefactor.Command.WALK);
        robotRefactor.order(RobotRefactor.Command.STOP);
        robotRefactor.order(RobotRefactor.Command.JUMP);
    }
}
