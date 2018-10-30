/* Super key word

* super it take parent class object
* 
* when you create object of sub class it will also call the constructor of super class
*
* 
*
*/

class A{
	
	public A() {
		System.out.println(" In A ..");
	}
	
	public A(int i) {
		System.out.println(" In int A ..");
	}
}

class B extends A{
	
	
	public B() {
		super();
		//super(5);
		System.out.println(" In B...");
	}
	
	public B(int i) {
		super(i);
		System.out.println(" In int B...");
	}
}


public class B5_SuperDemo_14 {
	
	

	public static void main(String[] args) {
		//B obj=new B();
		
		//A obj=new B();
		
		B obj1=new B(5);

	}

}
