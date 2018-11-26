package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PoliceTest {
    private static Police police = new Police();

    @Test
    public void should_return_true_when_police_check_an_adult_driver(){
        Driver adultDriver = new Driver(18);
        assertTrue(police.checkIfDriverIsAdult(adultDriver));
    }

    @Test
    public void should_return_false_when_police_check_an_teenager_driver(){
        Driver adultDriver = new Driver(5);
        assertFalse(police.checkIfDriverIsAdult(adultDriver));
    }
}
