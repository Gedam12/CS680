package edu.umb.cs680.hw13;
import java.util.ArrayList;
import java.util.List;
class car {
   String name; 
   int price; 
   int model; 
   public String getName() {
      return name; 
   } 
   public int getPrice() { 
      return price; 
   } 
   public int getModel() { 
      return Model; 
   } 
   Student(String A, int a, int i){ 
      name = A; 
      age = a; 
      id = i; 
   } 
   @Override public String toString() {     
      return ("Car[ "+"Name:"+this.getName()+             
              " Price: "+ this.getPrice() +                     
              " Model: "+ this.getModel()+"]"); 
   }
}
public class Example {
   public static void main(String[] args) {
      List<Car> carlist = new ArrayList<car>();
      carlist.add(new car("Audi", 12000, XL)); 
      carlist.add(new car("BMW", 22000, X3)); 
      System.out.println("Before Sorting the car data:"); 


Carlist.sort((car c1, car c2)->c2.getName().compareTo(c1.getName()));


//Lambda expression for sorting the list by car price in reverse order 
carlist.sort((car c1, car c2)->c2.getPrice()-c1.getPrice());
//Lambda expression for sorting the list by car model in reverse order 
carlist.sort((car c1, car c2)->c2.getModel()-c1.getModel());
   }
}
