package com.tws.refactoring;

public class Police {
    private final static int legalAdultAge = 18;

    public boolean checkIfDriverIsAdult(Driver driver) {
        return driver.getAge() >= legalAdultAge;
    }
}
