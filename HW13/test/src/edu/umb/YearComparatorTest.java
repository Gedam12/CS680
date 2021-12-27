package edu.umb.cs680.hw014;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class YearComparatorTest {

    LinkedList<Car> carList = new LinkedList<Car>();
    @Test
    void test() {
        Car car1 = new Car("Audi", "XL", 2005, 43, 12000);
        Car car2 = new Car("BMW", "X3", 2004, 40, 22000);
        carList.add(car1);
        carList.add(car2);
        Collections.sort(carList, (Car arg0, Car arg1) -> (int) (arg1.getPrice() - arg0.getPrice()));
        assertEquals(car2, carList.get(0));
        assertEquals(car1, carList.get(1));

    }

}
