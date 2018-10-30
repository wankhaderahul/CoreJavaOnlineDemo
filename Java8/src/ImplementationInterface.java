//Implementation or define method in interface


interface Phone{
	
	void call();
	
	default void msg() {
		System.out.println("sent");
	}
	
	static String staticMethod (String str) {
		System.out.println(str);
		return str;
		
		
	}
}


class AndroidPhone implements Phone{

	@Override
	public void call() {
		System.out.println("calling");
	}
	
}

public class ImplementationInterface {

	public static void main(String[] args) {
		Phone p=new AndroidPhone();
		p.call();
		p.msg();
		
		Phone.staticMethod("rahul");
		
		
		Phone pp=()->System.out.println("calling in interface only");
		pp.call();
		pp.msg();
		/* O/P

* calling
sent

*/
	}

}
