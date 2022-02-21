package com.company.basic;

public class Main {
    public static void main(String[] args) {
        Robot punchRunRobot = new Robot("달리는펀치로봇", new PunchAttackStrategy(), new RunMoveStrategy());
        punchRunRobot.attack();
        punchRunRobot.move();

        Robot punchFlyRobot = new Robot("날아다니는펀치로봇", new PunchAttackStrategy(), new FlyMoveStrategy());
        punchFlyRobot.attack();
        punchFlyRobot.move();
    }
}

