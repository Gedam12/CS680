package edu.umb.cs680;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

 private Calculator calc;

 @Test
 public void testAdd() {
  double result = calc.add(10.5, 20.32);
  assertEquals(30.82, result, 0);
 }

 @Test
 public void testSubtract() {
  float result = calc.subtract(100.5, 100);
  assertEquals(0.5, result, 0);
 }

 @Test
 public void testMultiply() {
  float result = calc.multiply(2.5, 100);
  assertEquals(250, result, 0);
 }

 @Test
 public void testDivide() {
  float result = calc.divide(100, 10);
  assertEquals(10, result, 0.001);
  
 }
 
 @Test(expected = ArithmeticException.class)
 public void testDivideByZero() {
  calc.divide(100.5, 0);
 }
}
