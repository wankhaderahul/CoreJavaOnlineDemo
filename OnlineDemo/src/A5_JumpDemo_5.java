
public class A5_JumpDemo_5 {
	
	/**
	 * Break, continue statement
	 * 
	 * 
	 * 
	 * */

	public static void main(String[] args) {

for(int i=0;i<=10;i++) {
	
	if(i==7) {
		continue;// skip/remove  7 for list (use for skip one iteration or skip the for loop and print the remaining iteration  )
	}
	
	System.out.println(" continue value = "+i);
}


for(int j=0;j<=10;j++) {
	
	if(j>5) {
		break;// skip all statement after 5 ( break use to break the loop and direct go out of loop)
	}
	
	System.out.println(" break value = "+j);
}
	}

}
