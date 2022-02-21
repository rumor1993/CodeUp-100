package com.company.refactoring.ch6_state_pattern;

public class StateLogging extends State {
    @Override
    public int getTypeCode() {
        return Logger.STATE_LOGGING;
    }
}
