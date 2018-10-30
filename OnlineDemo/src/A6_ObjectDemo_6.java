// class  & object

/*

* class is blue print of object 
* 
* class contains variable, method,constructor ,static block,nested block etc
* 
* object is super class
*
*object is well defined structure and behavior it is use  to create instance of class using constructor
*
* New key word is use to allocate memory 
*/
 class Calculator{
	
	 int num1;
	 int num2;
	 int result;
	 
	 
	 
	 public void perform() {
		 result=num1+num2;
	 }
}

public class A6_ObjectDemo_6 {
	
	  

	public static void main(String[] args) {
	
     
		Calculator   cal          =new     Calculator(); 
	/*	    |         |             |           |
       Class name    reference   keyword    constructor
                                 allocate
                                 heap memory
                                 
*/		cal.num1=3;              
		cal.num2=5;
		cal.perform();
		
		System.out.println(cal.result);
		
	
		

	}
	

}
