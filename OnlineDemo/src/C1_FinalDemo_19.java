/* Final variable/method/class
 * 
 * 
 * Final: Final keyword can be used with variable, method or class.
 * It prevents from its content from being modified. When declared with class, 
 * it prevents the class from being extended.

* Not modifiable not changeable constant
*
*ex:- some case constant value Circle Pie constant value
*
*final Always define in Capital
*
*Variable---> can not modifiable constant -->Constructor can be invoked only one time per object creation 
*
* Method -->can not override --> A method can be invoked as many times as you want (Even never) and the compiler knows it. 
* 
* class ---> can not extended
* 
* 
    A final class cannot be subclasses.
    A final method cannot be overridden by subclasses
    A final variable can only be initialized once

*
* Reason of using final: It ensures the thread safety for field/method or class,
*
*/

//  final class D can not extend


class G {
	
}

final class D //extends G //can be extended other classes
{
	
	//Variable
	
	int i=0;
	
	final int DAY;
	
	final float pi=3.14f;
	
	public D() {
		
		i=10;
	     DAY=20;
		//DAY=30; //compile time error because already declare --> Constructor can be invoked only one time per object creation 
	 	System.out.println(" In D final constructor.....");
		
	}
	

	//Method
	
	public final void show() {
		
		System.out.println(" In D show.....");
		
	}
	

	
	public void dispaly(){
		//DAY=30;
	}
}


class E {
	
	//compile time error not override
	//-->Constructor can be invoked only one time per object creation 
	
/*public void show() {
		
		System.out.println(" In E show.....");
	}*/

}
public class C1_FinalDemo_19 {

	public static void main(String[] args) {

		D obj=new D();
		System.out.println(obj.i);
		System.out.println(obj.DAY);
		D obj1=new D();
		
		
		obj.show();
		
		D obj12=new D();
		
		
	}

}
