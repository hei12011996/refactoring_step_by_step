package com.tws.refactoring;

public class Police {
    public boolean checkIfDriverIsAdult(Driver driver) {
        return driver.getAge() >= 18;
    }
}
