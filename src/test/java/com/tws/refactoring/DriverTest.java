package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DriverTest {

    @Test
    public void should_return_age_of_driver(){
        final int age = 18;
        Driver driver = new Driver(age);
        assertEquals(age, driver.getAge());
    }
}
