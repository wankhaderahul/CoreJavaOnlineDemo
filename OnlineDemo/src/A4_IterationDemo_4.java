import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;

/*
 * For Iteration and Loop
 * 
 * while loop,do while loop,for loop, enhanced for loop , for-each loop(java 1.8)
 * 
 * 
 *  difference       For loop                                   Enhanced for loop
 *        iterate increment and decrement order      only iterate in incremental order(i++)
 *      
 *     provide access to the index                    don't access to array index(can't replace index ele)         
 *                                                                
 *                                                                
*/                        
public class A4_IterationDemo_4 {
	
	public static void main(String[] args) {
		
		/*while(true) //infinite while loop
			System.out.println("hello");
		
		int i=1;
		//while loop initialization+declaration+increment
		while(i<=5) {
			System.out.println("hello while");
			i++;
		}
		
		
		int j=1;
		//int j=9; // o/p= print 1 times
		// do while loop condition is checked later
		//while loop initialization+declaration+increment
		do {
			System.out.println("hello1 do while");// o/p= print 5 times
			j++;
		}
		while(j<=5);
		
		for(int k=1;k<=5;k++) {
			System.out.println("hello for");// o/p= print 5 times
		}*/
		
		// Loop Assignment
		
		//inner for loop or nested for loop
		for(int f=1;f<=4;f++) {
			 StringBuilder stringBuilder=new StringBuilder();
			 //stringBuilder.append("* ");
		for(int g=1;g<4;g++) {
			//System.out.print(" * ");
			//System.out.print(g+" ");
			 stringBuilder.append("* ");
		}
		//System.out.print(" * ");
		 stringBuilder.append("* ");
		 System.out.println(stringBuilder); 
			/* i want print this type 4*4 * of o/p
		 
			* * * *
			* * * *
			* * * *
			* * * *
			
			*/
		}
		
		
	
	
		
		/*String s = "";
		for (int i = 1; i <= 5; ++i) {
		    s += "*";
		    //s+=i;
		    System.out.println(s);
		}*/
		
	StringBuilder sb = new StringBuilder();
	for(char alpha = 'A'; alpha <= 'C'; alpha++) {
	    sb.append(alpha);
	    System.out.println(sb.toString());
		}

	/*  o/p
	 
	A
    AB
    ABC
	
	*/
		
		StringBuilder sb1 = new StringBuilder();
		for(int alpha = 1; alpha <= 5; alpha++) {
		    sb1.append("*");
		    //sb1.append(alpha);
		    System.out.println(sb1.toString());
		}
		/*  o/p
		 
*        or 1
**          1 2
***         1 2 3
****        1 2 3 4
*****       1 2 3 4 5
		
		*/
		
		/*for(int i = 0; i < 27; i++){
	        for(int a = 0; a < i; a++){
	        System.out.print((char) (97+a));
	        }
	        System.out.println();
	    }*/
	
	int width = 4;
	int length = 4;
	
	for(int i=0;i<width;i++){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("* ");
        for (int j=2;j<length;j++){
            if(i==0){
              stringBuilder.append("* ");
            }else if(i==width-1){
              stringBuilder.append("* ");
            }else {
              stringBuilder.append("  ");
            }
        }
        stringBuilder.append("* ");
        System.out.println(stringBuilder);
    }
	
	/*//o/p square
	 
	* * * * 
	*     * 
	*     * 
	* * * * 
	
	* */
	
	
	//1.8 for each loop
	
	
	/*
	 * Read more: https://javarevisited.blogspot.com/2015/09/java-8-foreach-loop-example.html#ixzz5U4WWHd00

Java 8 has introduced a new way to loop over a List or Collection,
by using the forEach() method of the new Stream class.
java.util.sttream.Stream instance and then calling forEach() method.
stream can be sequential or parallel
forEach() method is that it's a terminal operation,
which means you cannot reuse the Stream after calling this method. 
It will throw IllegalStateException if you try to call another method on this Stream


*
*
*
*
*
*/
	
	//int [] a= {9,5,6,1,4}; // array not supported for each loop
	
	
	
	List<Integer> listOfPrimes = Arrays.asList(2, 3, 5, 7, 11, 3, 17);
	
	//List<Integer> listOfPrimes =new ArrayList<Integer>( Arrays.asList(2, 3, 5, 7, 11, 3, 17));

	 // forEach example to print each element of list
    // in this case we are using method reference becasue
    // we are not doing anything with each element of collection
    // and just passing ito println method
    System.out.println("Printing elements of list using forEach method : ");
    //listOfPrimes.stream().forEach(System.out::println);
    listOfPrimes.forEach(System.out::println);


 // let's do something to each element before printing
    // we will add comma after each element
    System.out.println("Printing elements after adding comma: ");
	listOfPrimes.stream().forEach((i) -> { System.out.print(i+","); });
	
	
	// you can also use forEach with parallel stream
    // order will not be guaranteed
    System.out.println("\nPrinting elements of list using parallel stream: ");
    listOfPrimes.parallelStream().forEach( i-> System.out.println(i*2)); 
    //listOfPrimes.stream().forEach( i-> System.out.println(i*2)); 

    System.out.println("Printing elements of list using filter and for each ");
    
    listOfPrimes.stream().filter(i->i%2==0)
                         .forEach(i->{System.out.println(i);});

	
    System.out.println("Printing Studnt using for each ");
	List<Studnt> listStudent=Arrays.asList(new Studnt(1,"rahul"),new Studnt(2,"pravin"));
	listStudent.stream().forEach((s)->{System.out.println(" id : "+s.getId()+" name : "+s.getName());});

	
	Set<Integer> set=new HashSet<>();
	set.add(4);
	set.add(1);
	set.add(9);
	set.add(9);
	
	 System.out.println("Printing set using for each ");
	//set.forEach(System.out::println);
	//set.stream().forEach((j->{System.out.print(j+","+" ");}));
	
	//set.stream().forEach((k)->{System.out.println(k*2);});
	 set.stream().filter(l->l%2==0).forEach((l)->System.out.println(l));
	
	Map<Integer, String> map=new HashMap<>();
	map.put(1, "mayur");
	map.put(2, "sachin");
	
	Set<Integer> keys=map.keySet();
	
	 System.out.println(" Printing map using for each ");
	
	keys.forEach((m)->{System.out.print("key :"+m+" value : "+map.get(m)+",");});
	
	}
}
