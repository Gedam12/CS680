package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CarTest {
    @Test
    private String[] carToStringArray(Car car) {
        String[] carInfo =  {car.getMake(), car.getModel(), Integer.toString(car.getYear())};
        return carInfo;
    }

    @Test
    public void verifyCarEqualityWithMakeModelYear()
    {
        String[] expected = {"Toyota","RAV4","2018"};
        Car actual= new Car("Toyota","RAV4",10,2018,10000);
        assertArrayEquals(expected,carToStringArray(actual) );
    }

}
