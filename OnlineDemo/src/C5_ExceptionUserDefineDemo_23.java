
public class C5_ExceptionUserDefineDemo_23 {

	public static void main(String[] args) {
		int i,j;
		i=8;
		//j=0;
		j=9;
		
		try {
		int k=i/j;
		
		if(k==0) 
			
			throw new C6_UserDefineException_24(" this not possible");
			System.out.println(k);
		
		}
		catch(C6_UserDefineException_24 e) {
			
			System.out.println(" Error .."+e.getMessage());
		}
		
        /*catch(Exception e) {
			
			System.out.println(" Error 1 .."+e.getMessage());
		}*/
				
	}

}
