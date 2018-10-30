import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class D5_MapDemo_32 {

	public static void main(String[] args) {

     Map<String,String> map=new HashMap<>();// HashMap --> Not Synchronized
     
     Map<String,String> map1=new Hashtable();// Hashtable --> Synchronized
     map1.put("myName", "Rahul");
     map1.put("actor", "Nawaj");
     map1.put("ceo", "Rajesh");
     map1.put("actor", "John");
     
     map.put("myName", "Rahul");
     map.put("actor", "Nawaj");
     map.put("ceo", "Rajesh");
     map.put("actor", "John");//key is unique, key work as Set
     
     System.out.println(map);//o/p {actor=Nawaj, myName=Rahul, ceo=Rajesh}
     
     System.out.println(map.get("myName"));//o/p Rahul
     
     System.out.println(map.get("myName1"));//o/p null --> no exception throws
     
     Set<String> keys=map.keySet();
     
     for(String key:keys) {
    	 System.out.println(" Key : "+key +"    Value :"+map.get(key));
     }
     
     
     
     Set<String> keyss=map1.keySet();
     for(String keyes:keyss) {
    	 System.out.println(keyes + " "+map1.get(keyes));
     }


	}
	
	
}
