import javax.swing.plaf.synth.SynthSpinnerUI;

//Synchronized keyword

//synchronization :-execute single thread at a time, Thread safe

//desynchronization :- execute multiple thread at a time


class Counter{
	
 	int count;//count --> 1-1000
 	
 	/*
     Synchronized execute one thread at a time remaining thread it will not execute that time.
*    after execute first thread then Synchronized all other thread allow to execute
*    
*    ex-->
*    t1 execute--> t2 wait
*    t2 execute -->t1 wait
*
*/

	public synchronized void increment() { // if not synchronized both thread accessing this method same time it is issues
		
		count++; // count= count+1
		            // |      |
		          //Assign  //addition
		
		
	}
}


public class D1_SynchronizedDemo_28 {

	public static void main(String[] args) throws Exception {
		
		Counter c=new Counter();
		//c.increment();
		//using anonymous inner class call runnable
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					c.increment();
				}
				
			}
		});
		
  Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					c.increment();
				}
				
			}
		});
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
		
		System.out.println("count ++ : "+c.count);
	}

}
