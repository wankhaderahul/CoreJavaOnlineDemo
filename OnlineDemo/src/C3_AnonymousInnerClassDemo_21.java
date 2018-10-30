/* AnonymousInnerClass

* Don't have class name of AnonymousClass   class 
*Only one AnonymousClass in class
*intention Only one time use that time use AnonymousClass
*how to create --->just create object and provide {} ex:- A a=new A()
*                                                       {
*                                                       public void show() { 
				                                         System.out.println(" In BCD show ");
				                                         }
				                                         };
*
*/


class ABC{
	
	public void show() {
		
		System.out.println(" In ABC show ");
	}
}


/*class BCD extends ABC{
	
public void show() {
		
		System.out.println(" In BCD show ");
	}

}*/

public class C3_AnonymousInnerClassDemo_21 {

	public static void main(String[] args) {
		ABC obj=new ABC()
				// AnonymousClass
				{
			public void show() { 
				
				System.out.println(" In Annonomous Dispaly method ");
			}
				};
				
			
				
		obj.show();

	}

}
