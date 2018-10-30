/* Inheritance 

* One class acquire the property and behavior of another calls is call Inheritance using 'extend' keyword
*
* parent and child relationship
*
*two types Single/Multi level  Inheritance
*
*use inheritance to remove code redundancy  and reuse code 
*
* Imp:- Achieve IS-A and HAS-A relationship
*
* when you create object of sub class it will also call the constructor of super class
*/


 // super, parent, base class.
class Cal{
	
	public int add(int i, int j)
	{
		return i+j;
	}
	
	public void show() {
		
		System.out.println("hi");
	}
}

// sub, child , derive class.
class CalAdv extends Cal{ // IS-A Relationship
	
public void show() {
		
		System.out.println("hello"); // override this method
	}
	
	public int sub(int i, int j)
	{
		return i-j;
	}
}


class CalVeryAdv extends CalAdv{ // IS-A Relationship
	
	public int mul(int i, int j)
	{
		return i*j;
	}
	
	
	/*
The compiler does not consider return type when differentiating methods, 
so you cannot declare two methods with the same signature even if they have a different return type.
*/
	/*public String mul(int i, int j)
	{
		.i..i..i..
	}*/
}

public class B4_InheritanceDemo_13 { // HAS-A Relationship

	public static void main(String[] args) {
		
	CalVeryAdv obj=new CalVeryAdv(); 
	int add=obj.add(6, 5);
	int sub=obj.sub(6, 5);
	int mul=obj.mul(6, 5);
	obj.show();//o/p hello override this method this is ambiguity which method call
	System.out.println(" add :"+add +" sub :"+sub +" mul :"+mul);
	}

}
