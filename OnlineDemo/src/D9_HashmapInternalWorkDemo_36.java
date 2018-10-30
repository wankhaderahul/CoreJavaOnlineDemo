import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/* Map --> Hashmap -->LinkedHashMap  -->TreeMap -->  Hashtable
 * 
 * you tube better link:- https://www.youtube.com/watch?v=fSjxhOYPBRI
*
*
*HashMap -->public class HashMap extends AbstractMap implements Map,Cloneable, Serializable
*
*A HashMap contains values based on the key.
It contains only unique elements.
It may have one null key and multiple null values.
It maintains no order.
*
*
*LinkedHashMap --> public class LinkedHashMap extends HashMap implements Map
*
*A LinkedHashMap contains values based on the key.
It contains only unique elements.
It may have one null key and multiple null values.
It is same as HashMap instead maintains insertion order.
*
*
*TreeMap -->public class TreeMap extends AbstractMap implements NavigableMap, Cloneable, Serializable
*
*A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
It contains only unique elements.
It cannot have null key but can have multiple null values.
It is same as HashMap instead maintains ascending order(Sorted using the natural order of its key).
*
*HAshTable -->public class Hashtable extends Dictionary implements Map, Cloneable, Serializable
*
*A Hashtable is an array of list. Each list is known as a bucket. The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
It contains only unique elements.
It may have not have any null key or value.
It is synchronized.
It is a legacy class.

It says the maximum size to which hashmap can expand, i.e, till 2^(30) = 1,073,741,824


//ek abaj seven cored thirteen seven lakh  fourty one thousand eight hundred twenty four


 * The default initial capacity - MUST be a power of two.
   static final int DEFAULT_INITIAL_CAPACITY = 16;

    The load factor used when none specified in constructor.
    static final float DEFAULT_LOAD_FACTOR = 0.75f;


It says default size of an array is 16 (always power of 2,)
Load factor means whenever the size of the hashmap reaches to 75% of its current size, 

Q) Difference in hash map in java 7 and 8 ?

Ans:- In Java 7 after calculating hash from hash function if more then one element has same hash than they are searched by linear search so it's complexity is (n). 
In Java 8 that search is performed by binary search so the complexity will become log(n).
 So, this concept is wrong that hash map searches an object in constant complexity because it is not the case at all times.




//How HashMap Works in Java  as below and implementation
 * 
 * link:- https://dzone.com/articles/how-hashmap-works-in-java
 * 
 * hashmap work on hashing principle.
 * Hashing mechanism is assigning unique code to a variable or attribute using an algorithm to enable easy retrieval. 
 * A true hashing mechanism always return the same hashCode() when same object.
 * HashMap stores the Objects as Entry instances, not as key and value
 * HashMap has an inner class called an Entry Class which holds the key and values.
 * 
 *  static class Entry<K,V> implements Map.Entry<K,V> 

 {

     final K key;

     V value;

     Entry<K,V> next;

     final int hash;

     ........

 }
 
 HashMap stores the Entry instances in an array and not as key-value pairs
 
 
 public V put(K key, V value) 

{

    if (key == null)

       return putForNullKey(value);

    int hash = hash(key.hashCode());

    int i = indexFor(hash, table.length);

    for (Entry<K,V> e = table[i]; e != null; e = e.next) 

    {

        Object k;

        if (e.hash == hash && ((k = e.key) == key || key.equals(k))) 

         {

             V oldValue = e.value;

             e.value = value;

             e.recordAccess(this);

             return oldValue;

          }

     }

     modCount++;

     addEntry(hash, key, value, i);

     return null;

 }

*
*/

public class D9_HashmapInternalWorkDemo_36 {

	public static void main(String[] args) {

		// simple hashmap working

		/*
		 * Map<String, Integer> maps=new HashMap<>(); maps.put("aaa", 1);
		 * maps.put("bbb",2); maps.put("ccc",3);
		 * 
		 * System.out.println(maps.entrySet());
		 * 
		 * Set<String> keys=maps.keySet();
		 * 
		 * for(String key:keys) { System.out.println(key +" "+maps.get(key)); }
		 */

		// Hash Collision -->same hashcode --

		/*
		 * String s1="FB"; String s2="Ea";
		 * 
		 * System.out.println(s1.hashCode() +" "+s2.hashCode());//same hashcode 2236
		 * Map<String, Integer> map=new HashMap<>(); map.put(s1, 1); map.put(s2,2);
		 */

		// how to remove duplicate and key is null using debug

		/*
		 * Map<String, Integer> map=new HashMap<>(); map.put("aa", 1); map.put("aa",2);
		 * map.put(null,3);
		 * 
		 * Set<Map.Entry<String, Integer>> set=map.entrySet();
		 * 
		 * for(Entry<String, Integer> entry:set) {
		 * 
		 * System.out.println(entry.getKey() +" "+entry.getValue());
		 * System.out.println(map.entrySet());
		 * 
		 * }
		 */

//how to increase size of hashmap with load factor and threshold debug
		
/* default initial capacity 16 -->load factor -0.75 -->default threshold =12

* if map size increase out of range of load factor table size will be double and threshold will be double
*
*/

	/*	Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 1);
		map.put("d", 2);
		map.put("e", 1);
		map.put("f", 2);
		map.put("g", 1);
		map.put("h", 2);
		map.put("i", 1);
		map.put("j", 2);
		map.put("k", 1);
		map.put("l", 2);
		map.put("m", 1);

		System.out.println(map.size());*/
		
		//Map<String, Integer> map=new HashMap<>(initialCapacity); // constructor default initial capacity(16) --> ex: if -18 -->increase table size(32) and threshold double()

		
		//get method working with debug
		
		/* get method first check the hascode -> then pointed to particular index ->and get this value

*if same hashcode --> compare value of equal method
*

*/
		
		/*Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("a", 1);
		
		

		System.out.println(map.size());
		Set<Map.Entry<String, Integer>> set =map.entrySet();
		
		for(Entry<String, Integer> entry:set) {
			
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println(key +" "+value);
			
		}*/
		
	Set<Integer> set=new HashSet<>();
	set.add(1);
	set.add(2);
		
		
	
	}
	
	}
