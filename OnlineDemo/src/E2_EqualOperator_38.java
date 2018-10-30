import java.util.HashMap;
import java.util.Map;

// == operator and .equal() method

/*
  == --> reference/address/hashcode comparison 
*
*.euqual() -->Content comparison
*
*
* Imp Note:- 
*
* .equal() method is present in object class meant for reference/address comparison only based on our requirement we can override for content comparison.
*
* in String classes all wrapper classes and all collection classes .equal() method override for content comparison
*
*/

class Employ{
	
	String name;
	
	public Employ(String name) {
		this.name=name;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employ other = (Employ) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	
	
	
	
}

public class E2_EqualOperator_38 {

	public static void main(String[] args) {
		
		String s1=new String("rahul");
		String s2=new String("rahul");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		


		System.out.println(s1==s2);//false -->reference comparison --> because checking address and address is difference store in heap memory
System.out.println(s1.equals(s2));//true --> content comparison --> because checking content,content is same (rahul-rahul)
		
		
		
		String s3="rahul";
		String s4="rahul";
		
		System.out.println(s3==s4);//true -->reference comparison --> because checking address and address is same store string pool
		System.out.println(s3.equals(s4));//true content comparison --> because checking content,content is same
		
		//imp
		System.out.println(s1.equals(s3));//true -->because is getting same memory address String constant pool
		
		Employ e1=new Employ("rahul");
		Employ e2=new Employ("rahul");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(e1==e2);//false -->-->reference comparison --> because checking address and address is difference
		System.out.println(e1.equals(e2));//without override object class .equal() reference comparison--> false , with override object .equal() content comparison -->true
		
		
		//Interview Question what is size and how to size 1 of Employ
		// Ans:-Using override equal and hashcode method
		
		Map<String,Integer> map=new HashMap<String, Integer>();
		map.put("rahul", 1);
		map.put("rahul", 2);
		
		
		Map<Employ, Integer> map1=new HashMap<>();
		map1.put(e1, 1);
		map1.put(e2, 2);
		
		System.out.println(map.size());//1
		System.out.println(map1.size());//without override object class .equal() & hashcode --> 2 , with override object class .equal() & hashcode -->1 
		
		System.out.println(map.containsKey(map1));
}
}