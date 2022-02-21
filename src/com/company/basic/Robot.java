package com.company.basic;

public class Robot {
    private String name;
    private AttackStrategy attackStrategy;
    private MoveStrategy moveStrategy;

    public Robot(String name, AttackStrategy attackStrategy, MoveStrategy moveStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
        this.moveStrategy = moveStrategy;
    }

    public void attack() {
        attackStrategy.attack();
    }
    public void move() {
        moveStrategy.move();
    }

    public void getName() {
        System.out.println("name = " + name);
    }
}
