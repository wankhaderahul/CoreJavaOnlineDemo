import org.omg.Messaging.SyncScopeHelper;

interface I{
	
	//void show();
	//void show(int i);
	 int show(int i);
}

//previous 1.8 need to implement interface in class and implementation of method --> it will need class time/memory consuming  

public class LambdaDemo {

	public static void main(String[] args) {
		
		//Anonymous Inner class --> LambdaDemo$1.class
		
		/*I obj=new I() {
			
			
			@Override
			public void show(int i) {
				System.out.println("using Anomymous iinner class ");
				
			}
		};
		obj.show(6);*/
		
		//lambda expression
		
		
		//I obj=()-> System.out.println(" void show() ");
		
		//I obj=i ->System.out.println(" void show(int i) "+ i);// (i) if only one parameter no need to add () in i -> jst i
		  
		I obj=(i)->{
			System.out.println("int show(int i)"+i); //Lambda or Consumer Interface 
			return i;
		};
		
		obj.show(6);
		
		
	}

}
