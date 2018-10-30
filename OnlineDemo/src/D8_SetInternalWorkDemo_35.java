import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set --> Hashset --> TreeSet --> LinkedHashSet

// link :- https://javaconceptoftheday.com/how-hashset-works-internally-in-java/
/*
 * 
 * Set use store element memory bucket, each bucket pointed to the particular hashcode.  ex:- set.add(obj) --> set.add--> memory bucket -->obj hashcode
 * 
 * searching operation of hashset first search the hashcode then pointed to the particular hashbucket.
 * 
 * 
HashSet uses HashMap internally to store it’s objects
Whenever you create a HashSet object, one HashMap object associated with it is also created.
 The elements you add into HashSet are stored as keys of this HashMap object.
 The value associated with those keys will be a constant.
* 
* 
* Hashset                    Treeset                                   LinkedHashSet
*
* use Set            use TreeMp(comparable & comparator)              use LinkedHashMap
* 
* 
* no maintain order    maintain ascending order                     maintain insertion  order
* 
* 
* faster                 slower                                          medium
* 
* 
*one null allow           null not allow                              one null allowed 
* 
* use doesnt maintain order use maintain ascending order              maintaind insertion order
* 
* 
*Sorted map -->add hashmap to your treemap
* 
*/

//Hashset Implementation

/*private transient HashMap<E,Object> map;

//Constructor - 1

public HashSet()
{
      map = new HashMap<>();          //Creating internally backing HashMap object
}

//Constructor - 2

public HashSet(Collection<? extends E> c)
{
      map = new HashMap<>(Math.max((int) (c.size()/.75f) + 1, 16));     //Creating internally backing HashMap object
      addAll(c);
}

//Constructor - 3

public HashSet(int initialCapacity, float loadFactor)
{
      map = new HashMap<>(initialCapacity, loadFactor);        //Creating internally backing HashMap object
}

//Constructor - 4

public HashSet(int initialCapacity)
{
      map = new HashMap<>(initialCapacity);          //Creating internally backing HashMap object

}


// Dummy value to associate with an Object in the backing Map
private static final Object PRESENT = new Object();

public boolean add(E e)
{
        return map.put(e, PRESENT)==null;
}

You can notice that, add() method of HashSet class internally calls put() method of backing HashMap object by passing the element you have specified as a key and constant “PRESENT” as it’s value.

*/

public class D8_SetInternalWorkDemo_35 {

	public static void main(String[] args) {
		/*
If you want a sorted Set then it is better to add elements to HashSet and then convert it into TreeSet rather than creating a TreeSet and adding elements to it.
*
*/
		
		Set<Integer> set =new HashSet<>();//random order
		Set<Integer> treeset =new TreeSet<>();//ascending order
		Set<Integer> linkedhashset =new LinkedHashSet<>();//insertion order
		set.add(null);
		set.add(2);
		set.add(1);
		set.add(2);
		
		set.add(null);
		//Removing 1 from HashSet
		//set.remove(1);
		
		
		//treeset.add(null);
		treeset.add(2);
		treeset.add(1);
		treeset.add(2);
		//treeset.add(null);
		
		for(Integer i:set) {
		System.out.println("Hashset : "+ i);// Hashset allow only one null key and remove duplicate element --> Non synchronized
		}
		
	/* o/p
null
1
2         
*
*/
		
		for(Integer i:treeset) {
			System.out.println("Treeset : "+ i);//1.8 TreeSet not allow only one null key and remove duplicate element ascending order --> Non synchronized
			}
		
		
		/* o/p
		 * 
		 * 1
		 * 2
*/
		
		
	}

}
