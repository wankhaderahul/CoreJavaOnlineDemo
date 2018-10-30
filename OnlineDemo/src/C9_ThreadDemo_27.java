//Thread

/* Unit of process is called thread

*
*Multi Taking
 
 Perform different task at a time it is csall multitasking
 ex:- same time ms office type message and listen a music
*
*
* Every java application by default one thread 'main' thread
 ex:- exception or main method
 exception in thread 'main' java.lang.ArithmaticException divided by zero
 
 wait()	                                                               sleep()
wait() method releases the lock	                             sleep() method doesn't release the lock.
is the method of Object class	                              is the method of Thread class
is the non-static method	                                  is the static method
is the non-static method	                                   is the static method
should be notified by notify() or notifyAll() methods	     after the specified amount of time, sleep is completed.
*
*
*/

//using ex extend Thread class
/*class Hi extends Thread //if you extend thread can not achieve multiple inheritance
{
	
	
	public void show() {
		
		for(int i=1;i<=5;i++) {
		System.out.println("Hi");
		
		try {Thread.sleep(1000);} catch (Exception e) {}
	}
		
		public void run() {
			
			for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
	}
	
}
   class Hello extends Thread{
	   
	   public void show() {
			
			for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
		
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch (Exception e) {}
				}
			
		}
	}*/

//using implements interface 
/*class Hi implements Runnable 
{
	
	
		
		public void run() {
			
			for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
	}
	
}
   class Hello implements Runnable{
	
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch (Exception e) {}
				}
			
		}
	}*/

//

// inter thread communication in java

/*class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notifyAll();
	}
}*/




public class C9_ThreadDemo_27 {

	public static void main(String[] args) throws Exception {

		// Hi obj1=new Hi();
		// Hello obj2=new Hello();

		// simple using

		// obj1.show();
		// obj2.show();

		// using extending Thread class
		/*
		 * obj1.start(); try {Thread.sleep(10);} catch (Exception e) {}// if you not use
		 * it will print random value obj2.start();
		 */

		// using implements interface

		// Runnable obj1=new Hi();
		// Runnable obj2=new Hello();

		/*
		 * Thread t1=new Thread(obj1);//need runnable interface start thrad using object
		 * creating of Thread
		 * 
		 * Thread t2=new Thread(obj2); t1.start(); try {Thread.sleep(10);} catch
		 * (Exception e) {}// if you not use it will print random value t2.start();
		 *
		 *
		 * 
		 * 
		 * 
		 * 
		 */

		// Good practice how to reduce you code same thing do above

		// using anonymous class

		Runnable obj1 = new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("Hi");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}

			}
		};

		Runnable obj2 = new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("Hello");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			}
		};

		/*
		 * Thread t1=new Thread(obj1); Thread t2=new Thread(obj2); t1.start(); try
		 * {Thread.sleep(10);} catch (Exception e) {}// if you not use it will print
		 * random value t2.start();
		 */

		// using Lambda expression

		Runnable obj3 = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}

		};

		Runnable obj4 = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		};

		/*
		 * Thread t3=new Thread(obj3); Thread t4=new Thread(obj4); t3.start(); try
		 * {Thread.sleep(10);} catch (Exception e) {} t4.start();
		 */

		// put your object direct in to your Thread using Lambda expression

		Thread t5 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hi" + Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}

		}, "Hi Thread");

		Thread t6 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}

		}, "Hello Thread");

		// set name or get name use for detecting which thread is working with name

		/*
		 * t5.setName("Hi Thread"); t6.setName("Hello Thread");
		 */
		System.out.println(t5.getName());
		System.out.println(t6.getName());

		/*
		 * Thread priority use to check the priority of thread
		 * 
		 * by default priority
		 * 
		 * Thread.MIN_PRIORITY=1 Thread.NORMAL_PRIORITY=5 Thread.MAX_PRIORITY=10
		 * 
		 * 
		 * 
		 * 
		 */
		t5.setPriority(Thread.MIN_PRIORITY);
		t6.setPriority(Thread.MAX_PRIORITY);

		System.out.println("Priority t5: " + t5.getPriority());
		System.out.println("Priority t6: " + t6.getPriority());

		 t5.start();
		try {Thread.sleep(10);} catch (Exception e) {
		}
		 t6.start();

		System.out.println("is alive before join thread : " + t5.isAlive());// use for detecting your thread is running
																			// state or not -->o/p true

		// join is use wait for execute thread
		// t1 execute --> wait t2 -->after execute t1 allow to execute t2
		// t2 execute --> wait t1

		// t5.join();
		// t6.join();

		System.out.println("is alive after join thread : " + t5.isAlive());// use for detecting your thread is running
																			// start or not -->o/p false

		System.out.println("Bye");// if not using join it will print randomly
		
		
		

		// inter thread communication in java
		
		/*
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();*/

	}

}
