package com.company.basic;

public class FlyMoveStrategy
        implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("날아다닙니다..");
    }
}
