package com.company.basic;

public class PunchAttackStrategy
        implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("펀치로 공격합니다.");
    }
}
