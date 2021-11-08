package edu.umb.cs680;

public class Calculator {

    public float add(float a, float b){
        return a+b;
    }
    
    public float subtract(float a, float b){
        return a-b;
    }
    
    public float multiply(float a, float b){
        return a*b;
    }

    public float divide (float a, float b) {
        if(b==0){
            throw new IllegalArgumentException("division by zero");
        }
        return a/b;
    }

    public static void main(String[] args){
        Calculator	calc = new Calculator();
        System.out.println( calc.add(4, 6) );
        System.out.println( calc.subtract(20, 4) );
        System.out.println( calc.multiply(8, 12) );
        System.out.println( calc.divide(30, 6) );
    }
}
