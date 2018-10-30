import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class D4_SetDemo_31 {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();//remove duplicate -->unorder --> not get method because working on hashing
		System.out.println(s.add(87));
		System.out.println(s.add(34));;
		System.out.println(s.add(99));;
		System.out.println(s.add(34));;
		
		
		
		Set<Integer> s1=new TreeSet<Integer>();//remove duplicate -->ascending order --> not get method
		s1.add(55);
		s1.add(44);
		s1.add(54);
		s1.add(44);
		
	  //Collections.sort(s1,(i,j)->i>j?1:-1); //set does not support Collections sorting
		System.out.println(" HashSet..");
		for(Integer i:s) {
			System.out.println(i);
		}
		
		
		System.out.println(" TreeSet..");
		for(Integer i:s1) {
			System.out.println(i);
		}
	}

}
