/*

* IF else
* 
* Ternary operator
* 
* Switch case

*/
public class A3_SelectionDemo_3 {

	public static void main(String[] args) {
		
// 1) If else statement
		
		
		int n=7;
		/*
		if(true)
			System.out.println("true");
		
		if(false)
			System.out.println("false");*/
		
		// if more than one statement if need {} brackets else single statement no need {}
		/*
		if(n==0)
			System.out.println("Nothing...");
		else if(n%2==0)
			System.out.println("Even");
		
		else
			System.out.println("odd");*/
		

		if(n==0) {
			System.out.println("Nothing...");
		     System.out.println("Bye...");
		}
		
		else if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
		
		
//2 ternary operator
		
		//?:-->condition?exp1:exp2 if(j>6?1:2)
		
		int i=8;
		int j=0;
		/*
		if(j>6)
		j=1;
		
		else
			j=2;
		System.out.println(j);*/
		
		j=j>6?1:2; //ternary operator
			System.out.println(j);
			
			
//Switch case
			
//switch not supported to double
//Switch String supported only 1.7 and later			
			
			int s=3;
			//int s=6; //default case
			
			switch(s) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:		
				System.out.println("three");
				break;
			case 4:	
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			default:
				System.out.println("nothing match ...");
			
			}
				/*char c='A';
				//int s=6; default case
				
				switch(c) {
				case'A':
					System.out.println("A");
					break;
				case 'B':
					System.out.println("B");
					break;
				case 'C':		
					System.out.println("C");
					break;
				case 'D':	
					System.out.println("D");
					break;
				case 'E':
					System.out.println("E");
					break;
				default:
					System.out.println("nothing match ...");
				
				}
			*/
			
			int g = 0;
			 g=g<6?1:2;
			 System.out.println(g);
			
			  
			}
	}


