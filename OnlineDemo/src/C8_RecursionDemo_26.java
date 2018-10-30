//Recursion in Java

/** method call it self 
 * Recursion in java is a process in which a method calls itself continuously/Infinite
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class C8_RecursionDemo_26 {

	//ex 1
	static void p(){  
		System.out.println("hello");  
		p();  
		}  
	
	//ex2
	static int count=0;  
	static void p1(){  
	count++;  
	if(count<=5){  
	System.out.println("hello "+count);  
	p1();  
	}  
	}  
	
	//ex3
	
	static int factorial(int n){      
        if (n == 1)      
          return 1;      
        else      
          return(n * factorial(n-1));      
  }     
	
	//ex 4 Fibonacci Series
	
	static int n1=0,n2=1,n3=0;      
    static void printFibo(int count){      
       if(count>0){      
            n3 = n1 + n2;      
            n1 = n2;      
            n2 = n3;      
            System.out.print(" "+n3);     
            printFibo(count-1);      
        }     
    }
    
    //other example 
    
    //Call by Value and Call by Reference in Java
    
    /*
There is only call by value in java, not call by reference.
*/
	
    int data=50;  
    
    void change(int data){  
    data=data+100;//changes will be in the local variable only  
    }  
    
    
	public static void main(String[] args) {
		//p();
		//p1();
		//System.out.println("Factorial of 5 is: "+factorial(5)); 
		
		/*int count=15;      
	      System.out.print(n1+" "+n2);//printing 0 and 1      
	      printFibo(count-2);//n-2 because 2 numbers are already printed   
*/	      
	      
	      C8_RecursionDemo_26 op=new C8_RecursionDemo_26();  
	      
	      System.out.println("before change "+op.data);  
	      op.change(500);  
	      System.out.println("after change "+op.data); 

	}

}
