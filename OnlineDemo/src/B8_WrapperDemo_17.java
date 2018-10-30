import java.util.ArrayList;
import java.util.List;

/*  byte,short,int,long,float,double,boolean,char

*String
*
*primitive work faster than wrapper
*
*Wrapper class use in Hibernate,Collection API,Type casting -->  List<Integer> ls=new ArrayList<Integer>();
*                                                   List<int> ls=new ArrayList<int>(); -->not supported
*                                                   
*                                                   
*Casting of data not possible to primitive only wrapper
*/                                                  


public class B8_WrapperDemo_17 {

	public static void main(String[] args) {
    
	// primitive datatype	
    int i=5;
    
  //wrapper class
    Integer ii=new Integer(i);  // Boxing --wrapping -->convert P To W
    
    int j=ii.intValue();   // Unboxing --> convert W to P
    
    Integer value=i; //Autoboxing
    
    int k=value; //Autounboxing
    
    String s="123";
    
  //int h=s; // CT Error Type mismatch: cannot convert from String to int
    int l=Integer.parseInt(s);//casting data possible only Wrapper classes not primitive
    System.out.println(l);
    
	}

}
