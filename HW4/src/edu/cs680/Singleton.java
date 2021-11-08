package edu.umb.cs680.hw02;

public class Singleton 
 {
    public final long itime;
    private static volatile Singleton singletonInstance = new Singleton();     
     //  Making constructor as private to prevent access to outsiders
     //  The instance of Singleton()  is created at the startup of the class. 
     //  Since it’s a static, it gets loaded and created during loading of the UCP class.
    private Singleton() 
      {
            // save the object instantiation time 
      itime = System.currentTimeMillis(); 
      System.out.println("Singleton() Constructor called ");
      }
    
    public static Singleton getInstance() 
      {
    return singletonInstance;
      }
   
  }
