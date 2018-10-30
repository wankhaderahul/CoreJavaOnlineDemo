

/*  Interface  --> Blue print of class 
 * 
 * 
 * In simple words, if you have some common methods that can be used by 
 * multiple classes go for abstract classes. Else if you want the classes 
 * to follow some definite blueprint go for interfaces.
 * 
 * Types  
 * 
 * 1)Normal --> more than one method
*  2) single abstract  -->only one method --> function interface --> Lambda expression  ---> scala --> java 8 all new feature taking up scala language
*  3)Marker Interface --->no any method -->Serializable,cloneble etc is marker interface
*
*
*Achieve multiple Inheritance
*
*All method interface by default "public abstract"
*
*can not define or implement method
*can not create object of interface 
*can create reference of interface
*Interfaces cannot have constructors  :-  why ? ANS below
*
*during the object creation of subclass, the parent constructor is called .
*But if there will be more than one interface implemented then a conflict will 
*occur during call of interface constructor as to which interface's constructor will call first
*
*interface doesn't allow you to declare any instance variables
*
*Interface allow only a constant variable, using static final
*
*In feature some one want to implement your interface don't need to define or implement method
*
* Very Imp:- 1.8 can define default ,static method and lambda expression  in interface
*/


  //@FunctionalInterface //-->-->only one method
  interface Writers{
		
		 /* 
	  Writers(){
		  //compile time error :- Interfaces cannot have constructors  
	  }*/
	  
	  
		//private void write(); error:- Illegal modifier for the interface method write; only public, abstract, default, static and strictfp are permitted
	
         int i=10; //variable by default static final ex:- static final int i=0; --> why ?:- 
	  
	  //static - because Interface cannot have any instance. and final - because we do not need to change it ambiguity problem
	  
	  
	  void write();
	
	  
	  
	/*  Very Imp:- 1.8 can define/implement default method in interface 
	 * 
	 * multiple default method but only one declare method --> functional interface
	 * 
	 * can be override default method
	 * */
	  default void show() {
		  System.out.println(" Interface Writers Default method In show");
	  }
	  
	  default void show(int i) {
		  System.out.println(" Interface Writers Default method In show int i"+i);
	  }
	  
	  static void display() {
		  System.out.println(" Interface Writers Static method In display");
	  }
	  
  }

  
  interface MyWriters {
	  
	  int i=20;
	  default void show() {
		  System.out.println(" Interface MyWriters Default method In show");
	  }
	  
	  void write();
	  
	 
  }

class Pens  implements Writers,MyWriters{
	
	
		//System.out.println(i); // compile time error --> this field is ambiguous
	
	
	
	

	@Override
	public void write() {
		//Writers.super.write(); //CT error Cannot directly invoke the abstract method write() for the type Writers
		System.out.println("I am Pen");
		
	}

	@Override
	public void show() {
		
		Writers.super.show();//override default method --> resolve ambiguity problem using super interface
		//MyWriters.super.show();
	}
	
	/*//override default method show
	public void show() {
		System.out.println(" Interface Default method In show Ovrride");
	}*/
}

/*class Pensils  implements Writers{

	@Override
	public void write() {
		System.out.println("I am Pensil");
		
	}

	
}*/

public class C2_IntefaceDemo_20 {
	public static void main(String[] args) {
      
		Writers obj=new Pens();
		obj.write();
		//obj.show();
		
		
		/*obj=new Pensils();
		obj.write();*/
		
		//1.8 default method
		obj.show();
		obj.show(10);
		
		//1.8 static method
		Writers.display();
		
		//Lambda Expression -->allow only functional interface -->method bracket () arrow -> and method definition ex:- A a=()->syso("I am lmbda");
		Writers obj1=()->System.out.println("Lamda expression");
		obj1.write();
		obj1.write();
		obj1.show();
		
		
	}

}
