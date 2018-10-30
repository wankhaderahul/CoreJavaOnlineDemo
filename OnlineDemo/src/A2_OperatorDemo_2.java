
/*

* Arithmetic --> +,-,*,/,%
* 
* Bitwise
* 
* Relational
*
*Logical
*
*
*
*/


public class A2_OperatorDemo_2 {
	
	public static void main(String[] args) {
		
		int m=4, n=5;
		
		int r1=m+n;
		int r2=m-n;
		double r3=(double)m/n;
		int r4=m%n;
		
		
		/*System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		*/
		
		 
		//System.out.println(++n);  // pre increment 
		
		//System.out.println(n++);  // post increment
		
		m=++n;  // pre increment  --> first increment the value then assigned it
		
		System.out.println(m);// o/p ==6
		
		/*m=n++;  // post increment  --> first assign the value then increment
		
		System.out.println(m);// o/p=5
*/		
       
		//m=--n; //first decrement and then assign --> o/p= 4
		//m=n--; //first assign that reason same result will be print  --> o/p= 5
	}
	
	

}
