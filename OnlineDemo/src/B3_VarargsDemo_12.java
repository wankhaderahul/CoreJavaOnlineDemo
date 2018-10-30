/* Variable Argument 

* --> Automatically increase the size of this element 
*/

	
	class Calcs{
		
		public int add(int ...n) {
			
			int sum=0;
			for(int i:n) {
				
				sum=sum+i;
			}
			
			return sum;
			
			
			
		}
	}

	public class B3_VarargsDemo_12 {
	public static void main(String[] args) {
		
		Calcs obj= new Calcs();
		
		System.out.println(obj.add(1,2,3,4,5,6));
	}
	}
