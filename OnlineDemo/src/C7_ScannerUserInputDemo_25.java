/* Scanner
 * 
 * use:- handle exceptionn,

*
*/

import java.util.Scanner;

public class C7_ScannerUserInputDemo_25 {

	public static void main(String[] args) {

     int n=0;
     //String s="test ";
     System.out.println(" Enter a number = ");
     
     Scanner sc=new Scanner(System.in);//getting input from keyboard,mouse,file
    n= sc.nextInt();
    //s= sc.next(s);
     System.out.println(n);
	}

}