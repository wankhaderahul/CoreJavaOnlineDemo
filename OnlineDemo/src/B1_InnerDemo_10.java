/* Inner class 3 Basic type
  
* Member class (without static class inner class)
*
* static class
*
* Anonymous class
*
*  Inner class not any specific use, use only support class or inner class
*  
*  create object of interface only way to implement interface to class
*/




class Outer{
	 
	 int a;
	 
	 public void show() { 
		 System.out.println(" In a Outer class");
	 }
	
	 class Inner{ // //Member class   --> Outer$Inner.class
		 
			 public void display() {
			 System.out.println(" In a Member class");
		 }
		 
	 }
	
       static int a1;
	 
	  static void show1() { 
		 System.out.println(" In a static methode");
	 }
	 
  static class Nestedclass{ //static class  -->  Outer$Nestedclass.class 
			 
		        public void display1() {
				 System.out.println(" In a Static class");
			 }
}

 }


//Anonymous Inner class


class AnonymousInnerClass{
	
	
	public void show() {
		System.out.println(" I am Anonymous inner class");
	}
	public int add(int a, int b) {
		return a+b;
		
		
	}
}

public class B1_InnerDemo_10 {
	
	// variable ,method, class

	public static void main(String[] args) {

       Outer obj= new Outer(); //outer class
       obj.show();
       
       Outer.Inner obj1=obj.new Inner(); //Inner or member class
       obj1.display();
       
       Outer.Nestedclass obj2=new Outer.Nestedclass(); //static class
       obj2.display1();
       
       
     //Anonymous Inner class calling

       AnonymousInnerClass an=new AnonymousInnerClass() {
    	   
    	   
    	   public int add(int a, int b) {
			return a+b;
    		   
    	   }
       };
     int j=an.add(10, 20);
       System.out.println(j);
       an.show();
       
	}

}
