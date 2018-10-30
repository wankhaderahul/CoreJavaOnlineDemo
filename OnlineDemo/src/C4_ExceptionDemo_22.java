/* ref link:-https://www.javatpoint.com/exception-handling-in-java
 * 
 * Exception:- core advantage of exception handling is to maintain the normal flow of the application.
use:-
try   --> create resource
catch  -->handle resource
finally --> close resource
throw-  -> throw an exception
throws--> declare exceptions -->used always method signature


unchecked exception --> compiler don't force to handle this exception occurs at Runtime this is called unchecked exception 
--> ex:- NullPointerException --> String s=null; 
          ArithmaticException --> int a=50/0;
          ArrayIndexOutofBoundException -->int a[]=new int[5];  a[10]=50;
          NumberFormatException --> String s="abc";  int i=Integer.parseInt(s);
          ClassCastException

checked exception --> compiler force to handle this exception occurs at compile time is is called checked exception 
-->ex:-  IOException -->
         SQLException -->
         FileNotFoundException -->

Error-->Error is irrecoverable e.g.StackOverflowError, OutOfMemoryError, VirtualMachineError, AssertionError etc.

A StackOverflowError basically is when you try to do something, that most likely calls itself, and goes on for infinity (or until it gives a StackOverflowError).

*/
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class C4_ExceptionDemo_22 {

	public static void main(String[] args) throws Exception //Throwable 
	{
		
		
		
		try {
		int i=7;
		i=i/0;
		
		System.out.println(" out put is :"+i);
		
		int a[]=new int[6];
		
		//a[7]=8;
		
		int b[]=null;
		b[4]=8;
		
		}
		
		//Q.:- In java 7 in catch block can I write multiple exception and what type of exception can I write.
		
		//ans:- if you are using super (general) class, don't use child (specialized) class. 
		// Allow unchecked exception and error
		
		
		
		//java 1.7 and above
		catch(ArithmeticException | ArrayIndexOutOfBoundsException |StringIndexOutOfBoundsException |NumberFormatException | NullPointerException  |ClassCastException /*|VirtualMachineError*/ |StackOverflowError |OutOfMemoryError  e) {
			//e.printStackTrace();//error print
			System.out.println("can not devide by zero ");
		}
		
		
		// Ct error --> Unreachable catch block for IOException. This exception is never thrown from the try statement body
		
		/*catch(IOException |SQLException |ClassNotFoundException e) {
			//e.printStackTrace();//error print
			System.out.println("can not devide by zero ");
		}*/
		
		
		//CT exception --> The exception ArithmeticException is already caught by the alternative Exception
		
		/*catch(Exception| ArithmeticException | ArrayIndexOutOfBoundsException  e) {
			//e.printStackTrace();//error print
			System.out.println("can not devide by zero ");
		}*/
		
		//CT exception -->he exception ArrayIndexOutOfBoundsException is already caught by the alternative Exception
		
		/*catch( ArithmeticException | ArrayIndexOutOfBoundsException |Exception e) {
		//e.printStackTrace();//error print
		System.out.println("can not devide by zero ");
	}*/
		
		/*catch(ArithmeticException   e) {
			//e.printStackTrace();//error print
			System.out.println("can not devide by zero ");
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			//e.printStackTrace();//error print
			System.out.println("out of limit ");
		}*/
		catch(Exception  e) {
			//e.printStackTrace();//error print
			System.out.println("something wrong ... ");
		}
		
		
		finally {
			System.out.println(" finally alwayes execute");
		}
		
	// new example
		
		int n=0;
		
		System.out.println("Enter a number");
		
				
		/*BufferedReader br = null;
		try { //create resources in try block
		
		
			
		br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());//45
		}
		catch(Exception e){ //handle resources in catch block
			System.out.println(e);
		}
		finally { //close resources in finally block
			br.close();
		}*/
		

		
	// Q When you use try with resource catch is mandatory or not 
		
		//ans:- when each resource is closed  that time use try with resources catch is not mandatory
		
		
		
		//1.7 try with resource not need to closed resource it will automatically close
	
		/*try(BufferedReader br1=new BufferedReader(new InputStreamReader(System.in))){
			n=Integer.parseInt(br1.readLine());//45
			System.out.println(n);
		}*/
		
		 // Using try-with-resources  
		try(FileOutputStream fileOutputStream =new FileOutputStream("/java7-new-features/src/abc.txt")){      
		String msg = "Welcome to javaTpoint!";      
		byte byteArray[] = msg.getBytes(); //converting string into byte array      
		fileOutputStream.write(byteArray);  
		System.out.println("Message written to file successfuly!");      
		}catch(Exception exception){  
		       System.out.println(exception);  
		}   
		
		  // Using try-with-resources  
		try(    // Using multiple resources  
		        FileOutputStream fileOutputStream =new FileOutputStream("/java7-new-features/src/abc.txt");  
		        InputStream input = new FileInputStream("/java7-new-features/src/abc.txt")){  
		        // -----------------------------Code to write data into file--------------------------------------------//  
		        String msg = "Welcome to javaTpoint!";      
		        byte byteArray[] = msg.getBytes();  // Converting string into byte array      
		        fileOutputStream.write(byteArray);  // Writing  data into file  
		        System.out.println("------------Data written into file--------------");  
		        System.out.println(msg);  
		        // -----------------------------Code to read data from file---------------------------------------------//  
		        // Creating input stream instance  
		        DataInputStream inst = new DataInputStream(input);    
		        int data = input.available();    
		        // Returns an estimate of the number of bytes that can be read from this input stream.   
		        byte[] byteArray2 = new byte[data]; //    
		        inst.read(byteArray2);    
		        String str = new String(byteArray2); // passing byte array into String constructor  
		        System.out.println("------------Data read from file--------------");  
		        System.out.println(str); // display file data  
		}catch(Exception exception){  
		       System.out.println(exception);  
		}     
		
		
		//Throwable
	
		// Q. why throwable not use in catch block
		
		// Ans:-Throwable is a interface not a class, because Throwable is superclass of exception and error, and error you can not handle/irrecoverable in your program that reason Throwable not use in program, It is not good practice
		
		try
	     {
	         // Do some stuff
	     }
	     catch(Throwable t)
	     {
            
	     }
		
		
	}

}
