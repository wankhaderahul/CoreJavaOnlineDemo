
/*Abstract class/method
 * 
 * 
 * 
 * In simple words, if you have some common methods that can be used by 
 * multiple classes go for abstract classes. Else if you want the classes 
 * to follow some definite blueprint go for interfaces.
  
* can not create object
* 
* when abstract method in class compulsory class make abstract
* 
* if you extend abstract class compulsory need to implement abstract method
* 
* abstract method only declaration
* 
* abstract class need to extend Concrete class
* 
* not need write same method repeat use common for all ex:- Animal dog, cat, fish--> common eat, sleep etc   --> uncommon other like flying, digging and walking
*
*
*  Suppose we were modeling the behavior of animals, by creating a class hierachy 
*  that started with a base class called Animal. Animals are capable of doing different 
*  things like flying, digging and walking, but there are some common operations as well 
*  like eating and sleeping. Some common operations are performed by all animals,
*  but in a different way as well. When an operation is performed in a different way,
*  it is a good candidate for an abstract method (forcing subclasses to provide a custom 
*  implementation). Let's look at a very primitive Animal base class, which defines an abstract
*   method for making a sound (such as a dog barking, a cow mooing, or a pig oinking).
*  
*/

/*
abstract class Human{ 
	
	public abstract void eat();
	
	public void walk() {
		
	}
	
}

class Man extends Human { //Man class is Concrete class

	@Override
	public void eat() {
		
		
	}
	
	
}


class Women extends Human { //Women class is Concrete class

	@Override
	public void eat() {
		
		
	}
	
	
}

*/


class Printer{
	
	public void show(Integer i) {
		System.out.println(i);
	}
	
	// it will support any number value because Number is abstract class 
	//Ex:- integer and double extends Number
	public void show1(Number i) { 
		System.out.println(i);
	}
} 


abstract class Writer{
	
	// can have constructor abstract class and if constructor so what is need ?
	
//Ans:- Yes	/*Constructor DOES NOT BUILD THE OBJECT. It is used to initialize an object, for memory allocation .
	
	
	//Each abstract class must have a concrete subclass which will implement the abstract methods of that abstract class. ... The same case applies to abstract classes

	/*Yes, an Abstract class always has a constructor. If you do not define your own constructor, the compiler will give a default constructor to the Abstract class. Above holds true for all classes - nested, abstract, anonymous, etc.

	An abstract class (unlike interface) can have non-final non-static fields which need initialization. You can write your own constructor in the abstract class to do that. But, in that case, there won't be any default constructor.

	public abstract class Abs{
	    int i;
	    int j;
	    public Abs(int i,int j){
	        this.i = i;
	        this.j = j;
	        System.out.println(i+" "+j);
	    }
	}*/
	 Writer(){
		
		System.out.println(" In Writer constructor");
	}
	
	 
	//static final int i; // not supporetd
	
	abstract void write();
	
	public  void display() {
		
	}
	
}

class Pen extends Writer{

	@Override
	void write() {
		System.out.println(" pen write");
		
	}
	
	
}


class Pensil extends Writer{

	@Override
	void write() {
		System.out.println(" pensil write");
		
	}
	
	
}

public class B9_AbstractDemo_18 {

	public static void main(String[] args) {
		//Human obj=new Man();
		
		Printer obj=new Printer();
		obj.show(5);
		
		
		obj.show1(6);
		obj.show1(5.5);
		
		//Writer wr=new Writer(); not possible it need to call concrete class same as below
		
		Writer obj1=new Pen();
		obj1.write();
		obj1.display();
		
		obj1=new Pensil();
		obj1.write();
		obj1.display();
				
	}

}
