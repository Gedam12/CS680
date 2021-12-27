package edu.umb.cs680.hw14;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.LinkedList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class MileageComparatorTest {

	static LinkedList<Car> cars = new LinkedList<Car>();
	
	@BeforeAll
	public static void initialize() {
		Car c1 = new Car("Audi", "XL", 2005, 50000, 90000);
		Car c2 = new Car("BMW", "M-Series", 2004, 30000, 55000);
		cars.add(c1);
		cars.add(c2);
		Collections.sort(cars,(Car arg0, Car arg1) -> arg1.getMileage()-arg0.getMileage());
	}
	
	
	@Test
	void testforcar1() {
		Car c1 = new Car("Audi", "Q7", 2015, 50000, 90000);
		assertEquals(c1, cars.get(0));
	}
	
	@Test
	void testforcar2() {
		Car c2 = new Car("BMW", "M-Series", 2018, 30000, 55000);
		assertEquals(c2, cars.get(1));
	}	

}
