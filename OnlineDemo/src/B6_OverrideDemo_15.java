/* Method Overriding 
 * 
 * https://stackoverflow.com/questions/1543191/method-overriding-in-java

* Two classes multiple method same name and same parameter it called method overriding 
* // run time polymorphism
*
* overriding a super class method using a sub class method
* 
* super represent a parent class object
* 
* You can not override private, static and final method in Java.
*                                                                       no 
* can not reduce accessibility of overridden method in Java.  -->public --> protected, private or package-private
*                                                     yes                  
*  increase accessibility of method  -->   protected  --> protected or public
*                                             yes
*                                    default -->  protected or public
*                                    
*                                    
*                                    
*   Some Rules of Overriding method in java
*   
* 1)overriding in Java is that you can only override method in sub class. You can not override method in same class
* 2)Java that name and signature of method must be same in Super class and Sub class or in interface and its implementation
* 3)can not reduce accessibility of overridden method can increase accessibility 
* 4) can not throw checked Exception which is higher in hierarchy than overridden method. -->throws IOException -->throws Exception
*    This rule doesn't apply to RuntimeException in Java 
* 5)You can not override private, static and final method in Java.
* 
*    ex:- You can not override private, static and final method in Java. private and static method are bonded during compile time using static binding in Java and doesn't resolve during runtime. overriding final method in Java is compile time error. Though private and static method can be hidden if you declare another method with same and signature in sub class
* 
* 6)Overridden method is called using dynamic binding in Java at runtime based upon type of Object.
* 
* 
* Q) what is static and dynamic binding ?
* Ans:- method bounded with compile time Static binding. ex:- private and static
*      bounded with runtime dynamic binding
*      
*      Polymorphism

1. Static binding/Compile-Time binding/Early binding/Method overloading.(in same class)

2. Dynamic binding/Run-Time binding/Late binding/Method overriding.(in different classes)
*/

class AA {
 
	int i=10;
	 void show() {
		System.out.println(" In AA");
	}

}

class BB extends AA {
    
	
	int i=19;
	protected void show() {
		// super.show();
		i=super.i; // o/p =10
		System.out.println(" In BB ");
	}
}

class CC extends BB{
	
	public void show() {
		
		System.out.println("In CC");
	}
	

}



public class B6_OverrideDemo_15 {

	// private constructor access on a class

	/*
	 * private B6_OverrideDemo(){ System.out.println("hiii"); }
	 * 
	 * B6_OverrideDemo obj=new B6_OverrideDemo(); B6_OverrideDemo obj1=new
	 * B6_OverrideDemo(); B6_OverrideDemo obj2=new B6_OverrideDemo();
	 */
    
	// run time polymorphism
	public static void main(String[] args) {

		/*BB obj = new BB();
		obj.show();*/
		
		//AA aa=new AA(); //// AA reference and object
		
		
		AA obj1=new BB(); //runtime polymorphism or dynamic method dispatch -->// AA reference but BB object
		obj1.show();
		
		obj1=new CC();
		obj1.show();   // runtime polymorphism or dynamic method dispatch --> // AA reference but CC object
		
		
		/*CC cc=new CC();
		cc.show();*/   // if you create object sub class it will conflict which super class called first
		/*
overloading, at compile time the compiler knows which method to link overriding 

compiler does not understand which method is called at compilation time. Only JVM decides which method is called at run-time
*/
	}

}
