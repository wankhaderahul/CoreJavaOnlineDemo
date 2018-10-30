/* Constructor , this keyword

*Constructor is member of method A()
Constructor same name of class name
Constructor never return anything thats reason no any return type of constructor
every time create object you need constructor
constructor is use to allocate memory 
constructor is use to initialize variable and provide the default value of veritable(Ex:- int i=0, float f=0.0)
can not call constructor in same instance it will automatically call when you create object
multiple constructor in same class with different parameter it is call constructor overloading (Ex:- A(), A(int i))
*
* Imp Q:- default constructor can access outside of package ?
*
*Ans: -NO, constructor will have a access-control of type default when no access-modifier is defined explicitly. So this constructor will have a Package Level Access. 
*/

  class Calc{
	
	 int num1; // instance variable;
	 int num2;
	 
	 
	 //default constructor
	 public Calc() {
		 
		 num1=1;
		 num2=2;
	 }
	 
	 
	 
 //A constructor will have a access-control of type default when no access-modifier is
 //defined explicitly. So this constructor will have a Package Level Access. Classes which 
 //are defined within that package as that of the class with this default constructor will be 
 //able to access it and also the classes that extend this class containing the default constructor 
//will be able to access it via inheritance 
	 
	/* //default constructor
	  Calc() {
		 
		 num1=1;
		 num2=2;
	 }*/
	 
//Parameterized constructor 
 public Calc(int i,float f) {// int i and float f is local variable
		 
		 num1=i;
		 num2=(int)f;
	 }
 
 
 // this keyword taking of current object or instance
 public Calc(int num1,int num2) {
	 
	 this.num1=num1;// current object or instance
	 this.num2=num2;
 }
	 
	
}
public class A7_ConstructorDemo_7 {
	
	public static void main(String[] args) {
		
		Calc obj=new Calc();
		Calc obj1=new Calc(5,6.5f);
		
		Calc obj2=new Calc(7,8);
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);
		
		System.out.println(obj2.num1);
		System.out.println(obj2.num2);
	}

}
