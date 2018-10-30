/*  Collection & Generic
 
 Collection :- group of object/elements
 
 collection -->concept
 Collection  -->Interface
 Collections ->Class
 
 
 Collection Interface --> List Interface --> ArrayList class
 
 int a[]=new int[4] --> size fixed
 
 Collection<Integer> value=new ArrayList<Integer>(); //<> Angular bracket
            value.add(1);
			value.add(2);
			
		bracket uses	
	() --> function or methods
	{} --> class,method
	[] --> Array
	<> --> Angular/diamond bracket for Genrics
	
	java 1.2 --> only collection   1.5--> Generic  1.7 -->  Collection <Integer> value= new ArrayList<>(); //no need to write integer in new Arraylist 
	
	
	List<Integer> l=new ArrayList<>(); --> duplicate value --> order/sequence elements -->working on index every index unique element
	    |                   |
     interface	         Class
  
     Set<Integar> s=new HashSet<>();  -->unique value --> unordered/random element
	              s=new TreeSet<>();  -->unique value --> Sorting elements
				  
   Map<Integer,String> m=new HashMap<>();   ->Synchronized (Thread safe)		  
	                   m=new HashTable<>();  ->Not Synchronized(not Thread safe)
					   
			

List I --> ArrayList C--> LinkedList C	

Set I  -->HashSet C --> TreeSet C -->  LinkedHashSet C		

Map I --> HashMap C --> HashTable C --> TreeMap C --> LinkedHashMap C
					   
 * @author  Josh Bloch
 * @author  Neal Gafter
 * @see     Set
 * @see     List
 * @see     Map
 * @see     SortedSet
 * @see     SortedMap
 * @see     HashSet ->fast -> remove duplicate
 * @see     TreeSet ->slow(sorting)->remove duplicate
 * @see     ArrayList -> dynamic array ->use array (manipulation slow)-> act as a list only -> better for storing and accessing 
 * @see     LinkedList->oubly linked list->use node(manipulation faster)->act list & queue ->better for manipulating
 * @see     Vector
 * @see     Collections
 * @see     Arrays
 * @see     AbstractCollection
 * @since 1.2
 
 
 Collection is interface create object using arraylist, you can add the values using add method and fetch the value using Iterator
 
 

*
*
*
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D2_CollectionDemo_29 {

	public static void main(String[] args) {
		//Collection value=new ArrayList();//collection doesn't support Index Number
		/*List value=new ArrayList();//Support Index Number -->generic use in java for type safe -->1.2 not supported generic
		value.add(3);// it not primitive its a wrapper ex:- Integer i=new Integer(3);
		value.add(9);
		value.add(6);
		value.add(1, 4);
		value.add("2");*/
		
		/*Iterator it=value.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}*/
		
		/*for(int i=0;i<value.size();i++) {
			System.out.println(value.get(i));
		}*/
		
		/*for(Object o:value) {
			System.out.println(o);
		}*/
		
		//List<Integer> list=new ArrayList<Integer>();//1.5 Generic need to specified type in object 
		List<Integer> list=new ArrayList<>();//1.7 Generic not need specified type in object -->Mutable
		List<Integer> list1=new ArrayList<>();
		list.add(404);
		list.add(908);
		list.add(639);
		list.add(265);
		
		//comparator -->create object using <Integer> and pass the Collections -->one declare method compare
		
		 //logic is sort value from last digit using Anonymous inner class
		/*Comparator<Integer> c=new Comparator<Integer>() {
	       @Override
			public int compare(Integer i, Integer j) {
				
				//logic is sort value using last digit
				
				//using if else
				
				if(i%10>j%10) {
					return 1;
				}
				else
				return -1;
				
				//using ternary operator --> declaration -->?-->Expression ex:- int i= a>b?1:2;
				
				return i%10>j%10?1:-1;
			}
		};*/
		
		 //logic is sort value from last digit using Lambda Expression
		
		/*Comparator<Integer> c=(i,j)->i%10>j%10?1:-1;
		
		Collections.sort(list, c);*/
		
		//Direct put your lambda to Collection;
		
		Collections.sort(list, (i,j)->i%10>j%10?1:-1);
		
		for(Integer i:list) {
			
			if(i==265) {
				continue; //Break/remove this value
				//break;  //loop terminate skip all value from condition
			}
			
			System.out.println(i);
		}
		
	}

}
