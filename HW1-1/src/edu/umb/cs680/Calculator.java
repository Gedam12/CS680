package edu.umb.cs680;

public class Calculator { 
 public float add(float a, float b) 
 {
  return a + b;
 }
 
 public float subtract(float a, float b) 
 {
  return a - b;
 }
 
 public float multiply(float a, float b) 
 {
  return a * b;
 }
 
 public float divide(float a, float b) 
 { 
  if(b == 0) 
  {
   throw new ArithmeticException("divided by zero");
  }
  return a / b;
 }
 
 public static void main(String[] args){
        Calculator	calc = new Calculator();
        System.out.println( calc.add(2, 3) );
        System.out.println( calc.subtract(6, 4) );
        System.out.println( calc.multiply(2, 3) );
        System.out.println( calc.divide(10, 2) );
}
}
