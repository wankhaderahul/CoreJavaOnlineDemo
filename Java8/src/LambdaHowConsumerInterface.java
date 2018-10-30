
//Lambda or Consumer Interface Implemntation

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*class ConsumaerImpl implements Consumer {

	@Override
	public void accept(Object t) {
		System.out.println(t);

	}

}*/

public class LambdaHowConsumerInterface {

	public static void main(String[] args) {

		List<Integer> value = Arrays.asList(4, 5, 6, 7, 8);
		
		//one way using class ConsumaerImpl Implement Consumer

		/*Consumer<Object> c = new ConsumaerImpl() {

		};
		value.forEach(c);
		
		*/
		
		//Second way Anonymous Inner class
		
		/*Consumer<Integer> c=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
		
		value.forEach(c);
		*/
		
		
		//Third way
		
		/*Consumer<Integer> c=(Integer t)-> {
				System.out.println(t);
				
			};
			
			value.forEach(c);
			*
			*/
		
		//Fourth way using Lambda

		//value.forEach(i->System.out.println(i));
		
		//Fieth way using Method reference
		value.forEach(System.out::println);
		
		//Multithread example with Lambda expression
		
		/*Thread t1=new Thread(()-> {
			
			for(int i=1;i<=5;i++) {
				System.out.println("Hi");
				try{Thread.sleep(1000);}catch(Exception e) {}
			}
			
			
			
		});
		
		Thread t2=new Thread(()->{
			
			for(int j=0;j<5;j++) {
				System.out.println("Hello");
				try{Thread.sleep(1000);}catch(Exception e) {}
			}
			
		});
		
		t1.start();
		try{Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		
		try{t1.join();}catch(Exception e) {}
		
		try{t2.join();}catch(Exception e) {}
		
		System.out.println(" after thread");
		
		*/
	}

}
