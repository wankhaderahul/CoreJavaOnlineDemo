/** String -> group of character -->  Immutable --> Increase performance
 * 
 * Immutable means -->can not change the state of object  --> i.e. 
 * 
 * 
 * Q. why String Immutable
 * Ans:i.e.In India  same name moew people  string(Rahul) it will more memory consume 
 * avoid memory memory consumption and space String is Immutable
 * 
 * 
 * Types 
 * 1)String literal --> String s="rahul"; --> use string pool -->stack
 * 2)new object --> String s1=new String ("rahul") -->use heap memory
 * 
 * 
 * i
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

class ImmutableString{
	
	String s="String";
}

public class E1_StringDemo_37 {

	public static void main(String[] args) {
		
		
//if string literal same it will save same memory address -->string pool
String str="rahul";

String str1="rahul";

str1.concat("pankaj");
//System.out.println(str1);

//if it is change string it will change/replace memory address in stack

str="wankhade";

//string tream

String s1="  hello string   ";  
System.out.println(s1+"javatpoint ");//without trim()  
System.out.println(s1.trim()+"javatpoint");//with trim()  ////The java lang.string.trim()is a built-in function that eliminates leading and trailing spaces. The Unicode value of space character is '\u0020'. The trim() method in java checks this Unicode value before and after the string, if it exists then removes the spaces and returns the omitted string.



String s2 ="  hello java string   ";  
System.out.println(s2.length());  
System.out.println(s2); //Without trim()  
String tr = s2.trim();  
System.out.println(tr.length());  
System.out.println(tr); //With trim()  


//String concat + and concat() method
String s="Sachin"+" Tendulkar";  
System.out.println(s);//Sachin Tendulkar  


String s3="Sachin ";  
String s4="Tendulkar";  
String s5=s1.concat(s4);  
System.out.println(s5);//Sachin Tendulkar  


//new String object -->use heap memory not String pool
//String s1=new String("rahul");


//Q) How to convert String Mutable ?

	//Ans:- Using StringBuffer or StringBuilder
	
	//mutable String
	
	StringBuffer sb=new StringBuffer("rahul");
	sb.append(" wankhade");
	//sb.replace(0, 5, "Manoj");
	
	//sb.delete(8, 10);
	
	String substr = "";
	substr =sb.substring(6, 13);
	System.out.println(sb);
	System.out.println(substr);

	
	String ss="ravi"; //ss & sc two object store in same memory address in SCP
	
	String sc="ravi";//ss & sc two object store in same memory address in SCP
	
	ss="baraskar "; // ss create new object in SCP --> O/P baraskar
	
	ss.concat("bahada");//String is Immutable that reson not able to change
	System.out.println(ss); //o/p baraskar
	
	String se=" mech";
	
	String sf=ss.concat(se);//if create new obj possible to concat
	System.out.println(sf);//o/p baraskar  mech


	String sg=new String ("ravi");//Store obj in Heap Memory
	
	String sh= sg.concat(" baraskar");
	
	System.out.println(sg);// o/p -->ravi
	System.out.println(sh);//o/p -->ravi baraskar
	
	String si=new String("ravi").intern();//if same string literal and new intern() method  it will take from STC
	
	String sj="ravi";
	
	String sk=new String("ravi");
	
	System.out.println(sj.equals(sk));//true --> because it take from same memory address -->reference comparison
	
	
	
	}

	
	
}
