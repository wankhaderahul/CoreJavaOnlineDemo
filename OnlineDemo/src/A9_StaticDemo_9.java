/*  Static
 * 
 * 
 * Static: Static modifier is used with class variables and methods which can be accessed
 *  without instance of class. Static variables has only single storage. All objects share 
 *  the single storage of static variable. They can be accessed directly without any object. 
 *  Static methods can also be declared. main() method is the popular static method we have. 
 *  Static blocks can also be declared and are executed before main() method.

Can't create object/instance of class and not heap memory allocated it is used class loader memory of jvm

It will executed when you load class (executed at a time of class loading)

Executed before the constructor/main method at a time of class loading then execute constructor

Static block not access non static variable
this and super not allow in static

execute only once

Restrictions for the static method

There are two main restrictions for the static method. They are:

    The static method can not use non static data member or call non-static method directly.
    this and super cannot be used in static context.



* The static can be:

    Variable (also known as a class variable) --> common property of all 
    Method (also known as a class method) --> don't need object & invoke without creating instance of class
    --> can be overload can not be override
    --> bounded during compile time using type of reference variable not an object
    
    Block --> execute only once
    Nested class

*
*
*Static method is class level and overriding become instance level that reason static method can't be override
*
*/

class Emp{
	

	//Static variable
	int eid;
	int salary;
	static String ceo;
	static String ceos="Dhana";
	   static int callCount = 0;
	   int callCounts = 0;
	
	public void show() {
		
		System.out.println( "eid :"+ eid  +" salary :"+salary+ " ceo :"+ceo );
		//this.eid=30; // this allow normal method
		//static int c=0;///not allow in method only call level
		ceos="Rahul";
		 callCounts++;
    	 
   	  System.out.println("Calls 1: " + callCounts +" "+ceos);
		
	}
	
	//Static Method
	
   // A static method belongs to the class rather than the object of a class.
   // A static method can be invoked without the need for creating an instance of a class.
   // A static method can access static data member and can change the value of it.

    static void change(){  
    	//eid=30; //CT error Cannot make a static reference to the non-static field eid
    	int i=30;// it can allow local variable
    	//this.eid=40; // CT error Cannot use this in a static context
    	//super.eid=60;// CT error Cannot use super in a static context
    ceos = "Bhimesh"; 
    System.out.println(ceos);
    System.out.println(" in Static method ......"+i);
    
    }  
    
    public static void method() {
    	//static int callCount = 0; // CT error declare in global only
    	  callCount++;
    	 
    	  System.out.println("Calls: " + callCount);
    	}

    	
	
	//Static block
    
    static  //executed when you load a class
    {
    	//this.eid=40; // CT error Cannot use this in a static context
    	//super.eid=60;// CT error Cannot use super in a static context
    	int k=10;
    	ceo="Larry";
    	System.out.println(" in Static block ......"+k +" " +ceo);
    }
    
    public Emp() //executed when you create object
    
    {
    	eid=22;
    	salary=6000;
    	System.out.println(" in Constructor ......");
    }
    
    //Static class or nested class
	
    /*
    	//its member variables and methods (don't nessarily need to be static)
    	//but cannot access members of the enclosing class
    public static class nestedStaticClass {
    	    public static class nested1   {
    		public static class nested2   {
    			public void shownested() {
    				System.out.println(" ntested class");

    			}
    			}
    		}
    	}*/
    	
    	
    
}

public class A9_StaticDemo_9 {

	public static void main(String[] args) {
		
		
		//Static variable
		
     /* Emp navin= new Emp();
      navin.eid=4;
      navin.salary=4000;
      Emp.ceo="Rajesh";
      
      Emp rahul= new Emp();
      rahul.eid=5;
      rahul.salary=5000;
      Emp.ceo="Rajesh";
      Emp.ceo="Mahesh";
      
      navin.show();
      rahul.show();*/
		
		 Emp pankaj= new Emp();
	      Emp sagar= new Emp();
	      
	      pankaj.show();
	      sagar.show();
	      
      
  	//Static Method
      
      Emp.change();
      
      Emp.method();//o/p 1
      Emp.method();//o/p 2
      Emp.method();//o/p 3
      Emp.method();//o/p 4
    
   
     
      
      
    //Static class or nested class
      
      
	}

}
