//Comparator & Comparable

/* Comparable and Comparator both are interfaces and can be used to sort collection elements.

*
*Comparable	                                                                           
1) Comparable provides a single sorting sequence. In other words, we can sort the collection on
  the basis of a single element such as id or name
   or price, etc.
	
2) Comparable affects the original class, i.e., the actual class is modified.	
3) Comparable provides compareTo() method to sort elements.
4) Comparable is found in java.lang package.	
5) We can sort the list elements of Comparable type by Collections.sort(List) method.	
*
*
*Comparator
*
*1)The Comparator provides multiple sorting sequences.In other words, we can sort the collection on the basis of multiple elements such as id, name, and price, etc.
*2)Comparator doesn't affect the original class, i.e., actual class is not modified.
*3)	Comparator provides compare() method to sort elements.
*4) A Comparator is found in the java.util package.
*5)We can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Using implements Comparable interface

class Studented implements Comparable<Studented>{
	int rollno;
	String name; 
	int mark;
	
	public Studented(int rollno, String name, int mark) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}
	
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	//toString method use print the object
	@Override
	public String toString() {
		return "Studented [rollno=" + rollno + ", name=" + name + ", mark=" + mark + "]";
	}



	@Override
	public int compareTo(Studented s) {
		//return mark>s.mark?1:-1;
		//return name.length()>s.name.length()?1:-1;
		//return rollno>s.rollno?1:-1;
		//return name.length()>s.name.length()?1:-1;
		return s.name.compareTo(s.name);
	}
	
	
}

//Using implements Comparator interface

/*class Studented {
	int rollno;
	String name; 
	int mark;
	
	public Studented(int rollno, String name, int mark) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}
	
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	//toString method use print the object
	@Override
	public String toString() {
		return "Studented [rollno=" + rollno + ", name=" + name + ", mark=" + mark + "]";
	}



	
	
}

class NameComparator implements Comparator<Studented>{

	@Override
	public int compare(Studented i, Studented j) {
		// TODO Auto-generated method stub
		//return i.name.length()>j.name.length()?1:-1;
		//return i.rollno%10>j.rollno%10?1:-1;
		//return j.name.compareTo(i.name);
		
		return i.name.compareTo(j.name);
	}
	
	
	
}

class MarkComparator implements Comparator<Studented> {

	@Override
	public int compare(Studented s1, Studented s2) {
		
		//return s1.mark>s2.mark?1:-1;
		return s2.mark>s1.rollno?1:-1;
	}
	
}
*/
public class D3_ComparableSortDemo_30 {

	public static void main(String[] args) {

 List<Studented> listStudent=new ArrayList<Studented>();
 listStudent.add(new Studented(5,"Rahul",506));
 listStudent.add(new Studented(2,"Brtiss",203));
 listStudent.add(new Studented(1,"Artisss",100));
 
 System.out.println("get method .."+listStudent.get(1));
 //Comparable
 
 //Collections.sort(listStudent);
 
 //using comparator
 Collections.sort(listStudent,(i,j)->i.mark>j.mark?1:-1);//use for Comparable lambda and ternary operator override the logic using comparator
 for(Studented s:listStudent) {
		
	 System.out.println(s);
 }
 
 
//Comparator
 
/* Collections.sort(listStudent,(i,j)->i.mark>j.mark?1:-1);//use for comparator lambda 
 
 for(Studented s:listStudent) {
		
	 System.out.println(s);
 }*/
 
 /*Collections.sort(listStudent,new NameComparator());
 System.out.println("Sorting by Name..."); 
    for(Studented s:listStudent) {
	 System.out.println(s);//when you print object it will call to string method

 }*/
    
    
 /*Collections.sort(listStudent,new MarkComparator());
 
	
 System.out.println("sorting by Mark..."); 
 
 for(Studented s:listStudent) {
	
	 System.out.println(s);
 }*/
 

	}

}
