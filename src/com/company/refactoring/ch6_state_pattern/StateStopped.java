package com.company.refactoring.ch6_state_pattern;

public class StateStopped extends State {
    @Override
    public int getTypeCode() {
        return Logger.STATE_STOPPED;
    }
}
