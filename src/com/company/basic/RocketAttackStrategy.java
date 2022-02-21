package com.company.basic;

public class RocketAttackStrategy
        implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("미사일로 공격합니다.");
    }
}
