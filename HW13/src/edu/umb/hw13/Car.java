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
  
      carlist.forEach((c)->System.out.println(c));

      System.out.println("After Sorting the car data by Model:"); 

      //Lambda expression for sorting by Model 
      Carlist.sort((car c1, car c2)->c1.getModel()-c2.getModel()); 
     
      carlist.forEach((c)->System.out.println(c));         

      car.out.println("After Sorting the car data by Name:"); 
      //Lambda expression for sorting the list by car name       
      carlist.sort((car c1, car c2)->c1.getName().compareTo(c2.getName())); 
      carlist.forEach((c)->System.out.println(c));        
      System.out.println("After Sorting the car data by Name:"); 
     
      //Lambda expression for sorting the list by car model
      carlist.sort((car c1, car c2)->c1.getname()-c2.getname()); 
      carlist.forEach((c)->System.out.println(c)); 
   }
}
