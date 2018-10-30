//Enum 1.5 java onwords

/*Enum is used for constant 
 * it is predifiend type
 
*
*i.e. range of integer - to +, colour , mobile company --> create your own range
*  ; --> semicolon not compulsary enum
*  
*  --->define enum separate  and inside class and outside of class
*
*enum use in switcht
*
*in c & c++ enum not allow veriable and method but java supported veriable an dmethod in enum
*
*every java class Enum extens Enum --> enum extend object class
*
*
* emun not possible to extend class--> becuase it alreay extend Enum
* 
* enum can implement interface 
* 
* enum method --> values(), ordinary() etc
*/

enum Mobile{
	
	APPLE(100),
	SAMSUNG(200)
	,MI(50);
	
	int price;
	
	/* Mobile() {
		price=80;
		System.out.println(" In constructor");
	}*/
	
	Mobile (int p){
		price =p;
	}
	
	public int getPrice(){
		return price;
	}
}

//internally creat class of enum and veriable static final as below same u use enum

/*class Mobile{
	
static final Mobile AAPPLE=new Mobile();
static final Mobile SAMSUNG=new Mobile();
static final Mobile MI=new Mobile();
}*/

public class E3_EnumDemo_39 {
	/*enum Mobile{
		
		APPLE,
		SAMSUNG,MI
	}*/

	public static void main(String[] args) {
		
		
		
		System.out.println(Mobile.APPLE);

		Mobile m=Mobile.APPLE;
		
		switch(m) {
		
		case APPLE:
		System.out.println(" Apple is best");
		break;
		case SAMSUNG:
			System.out.println("1 copy of samsung");
			break;
		case MI:
			default:
				System.out.println("nothing");
		}
		
		System.out.println(Mobile.APPLE.getPrice());
		System.out.println(Mobile.SAMSUNG.getPrice());
		System.out.println(Mobile.MI.getPrice());
		
		System.out.println(Mobile.APPLE.ordinal());//print sequence --> o/p 0
		
		Mobile mm[]=Mobile.values();//fetch all value from Enum -->no any value method in Enum it is provided compiler or JVM
				
				for(Mobile mob:mm) {
					
					System.out.println(mob);
				}
	}

}
