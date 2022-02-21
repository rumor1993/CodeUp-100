package com.company.refactoring.ch6_state_pattern;

public class Logger {
    public static final int STATE_STOPPED = 0;
    public static final int STATE_LOGGING = 1;

    private State _state;

    public Logger() {
        setState(STATE_STOPPED);
    }

    public void start() {
        switch (getState()) {
            case STATE_STOPPED:
                System.out.println("** START LOGGING **");
                setState(STATE_LOGGING);
                break;
            case STATE_LOGGING:
                // 아무것도 하지 않음
                break;
            default:
                System.out.println("Invalid state: " + _state);
        }
    }

    public void stop() {
        switch (getState()) {
            case STATE_STOPPED:
                // 아무것도 하지 않음
                break;
            case STATE_LOGGING:
                System.out.println("** STOP LOGGING **");
                setState(State.STATE_LOGGING);
                break;
            default:
                System.out.println("Invalid state: " + _state);
        }
    }

    public void log(String info) {
        switch (getState()) {
            case STATE_STOPPED:
                System.out.println("Ignoring " + info);
                break;
            case STATE_LOGGING:
                System.out.println("Logging " + info);
                break;
            default:
                System.out.println("Invalid state: " + _state);
        }
    }

    public State getState() {
        return _state;
    }

    public void setState(State state) {
        _state = state;
    }
}
