//equals() and hashcode()

//..link :- https://dzone.com/articles/working-with-hashcode-and-equals-in-java

/**
 * By default, the Java super class java.lang.Object provides two important methods for comparing objects: equals() and hashcode(). 
 * 
 * equals(Object obj): a method provided by java.lang.Object that indicates whether some other object passed as an argument is "equal to" the current instance. The default implementation provided by the JDK is based on memory location — two objects are equal if and only if they are stored in the same memory address.
 * 
 * hashcode(): a method provided by java.lang.Object that returns an integer representation of the object memory address. By default, this method returns a random integer that is unique for each instance. This integer might change between several executions of the application and won't stay the same.
 * 
 * Note:- If two objects are equal according to the equals(Object) method, then calling the hashcode() method on each of the two objects must produce the same integer result.
 * 
 * */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

 class Studnt {

    private int id;

    private String name;

    public Studnt(int id, String name) {

        this.name = name;

        this.id = id;

    }

    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }
    
    
    
   /* @Override
	public String toString() {
		return "Studnt [id=" + id + ", name=" + name + "]";
	}*/

	//@Override
    public boolean equals(Object obj) {

        if (obj == null) return false;

        if (!(obj instanceof Studnt))

            return false;

        if (obj == this)

            return true;

        return this.getId() == ((Studnt) obj).getId();
      // return this.getName() == ((Studnt) obj).getName();
    }
    
    @Override
    public int hashCode() {

        return id;

    }
    
    //eclipse auto generated equal() and hashCode()

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}*/
	/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studnt other = (Studnt) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
    
    */
    

}

 
public class D6_HashCodeDemo_33 {

	public static void main(String[] args) {
		
		
		
		Studnt alex1 = new Studnt(1, "Alex");

		Studnt alex2 = new Studnt(1, "Alex");
		
		Studnt alex3 = alex2;

        System.out.println("alex1 hashcode = " + alex1.hashCode());

        System.out.println("alex2 hashcode = " + alex2.hashCode());
        
        System.out.println("alex2 hashcode = " + alex3.hashCode());

        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
        
        System.out.println("Checking equality between alex2 and alex3 = " + alex2.equals(alex3));
        
        
        /* O/p without override equal method
         * 
         * alex1 hashcode = 1704856573
           alex2 hashcode = 705927765
           alex2 hashcode = 705927765
           Checking equality between alex1 and alex2 = false
           Checking equality between alex2 and alex3 = true
         * 
         * 
         * **/
        
        /* O/p with override equal method
         * 
         * alex1 hashcode = 1704856573
           alex2 hashcode = 705927765
           alex2 hashcode = 705927765
           Checking equality between alex1 and alex2 = true
           Checking equality between alex2 and alex3 = true
         * 
         * 
         * **/
        
        //equals() With ArrayList
        
        Studnt alex = new Studnt(1, "Alex");

        List < Studnt > studentsLst = new ArrayList < Studnt > ();

        studentsLst.add(alex);

        System.out.println("Arraylist size = " + studentsLst.size());
        
        System.out.println("hashcode alex = " + alex.hashCode());
        System.out.println("hashcode studentsLst = " + studentsLst.get(0).hashCode());

        System.out.println("Arraylist contains Alex = " + studentsLst.contains(new Studnt(1, "Alex")));
        System.out.println("Arraylist contains Alex = " + studentsLst.contains(new Studnt(2, "Alex")));
        
        //O/p 
        
        /*
Arraylist size = 1
hashcode alex = 366712642
hashcode studentsLst = 366712642
Arraylist contains Alex = true
Arraylist contains Alex = false

*/
        
        //Overriding hashcode() &  equals() With HashSet
        
        Studnt alex4 = new Studnt(1, "Alex");
      
        Studnt alex5 =new Studnt(1, "Alex");
        
       Set<Studnt> students=new HashSet<Studnt>();
       students.add(alex4);
       students.add(alex5);
       System.out.println("Hashcode HashSet alex4 = " + alex4.hashCode());
  
       System.out.println("Hashcode HashSet alex5 = " +alex5.hashCode());

       System.out.println("HashSet contains Alex = " + students.contains(new Studnt(1, "Alex")));
       System.out.println("HashSet equal Alex = " + alex4.equals(alex5));
       
       for(Studnt s:students) {
    	   System.out.println(s.hashCode());//when HashSet searches for an element inside it, it first generates the element's hash code and looks for a bucket which corresponds to this hash code.
    	   System.out.println(s.getId()+" "+s.getName());
       }
       
       //o/p simple
       
       /*

*Hashcode HashSet alex4 = 1829164700
Hashcode HashSet alex5 = 2018699554
HashSet contains Alex = false
2018699554
1829164700

*
*/
       
 //o/p when override hashcode with id 
       
       /*

Hashcode HashSet alex4 = 2
Hashcode HashSet alex5 = 1
HashSet contains Alex = true
1
2

*
*/
       
       
     /*  // Note

*
*
    If two objects are equal, they MUST have the same hash code.
    If two objects have the same hash code, it doesn't mean that they are equal.
    Overriding equals() alone will make your business fail with hashing data structures like: HashSet, HashMap, HashTable ... etc.
    Overriding hashcode() alone doesn't force Java to ignore memory addresses when comparing two objects.

*
*/
       
	}

}
