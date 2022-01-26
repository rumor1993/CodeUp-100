package com.company.refactoring.ch1_magic_number;

public class App {
    public static void main(String[] args) {
        Robot robot = new Robot("Andrew");
        robot.order(0);
        robot.order(1);
        robot.order(2);
    }
}
