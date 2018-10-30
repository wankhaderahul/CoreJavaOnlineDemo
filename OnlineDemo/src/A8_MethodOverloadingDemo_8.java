/**
 * Method overloading and constructor overloading
 * 
 * compile time polymorphism 
 * 
 * */

 class Casio{
	 
	 //Methode overloading
	 
	 public void add(int i) {
		 System.out.println(i);
	 }
	 
 public void add(int i, int j) {
	 System.out.println(i+j);
	 }
 
 public void add(int i,int j, int k) {
	 System.out.println(i+j+k);
 }
 
 
//Constructor overloading
 
 int num1;
 int num2;
 String operation;
 
 public Casio() {
	 num1=0;
	 num2=0;
	 operation="Nothing";	 
 }
 
 public Casio(int i) {
	 num1=i;
	 num2=0;
	 operation="Nothing";	
 }
 
 public Casio(int i, int j) {
	 num1=i;
	 num2=j;
	 operation="Nothing";	
 }
 
public Casio(int i, int j,String op) {
	num1=i;
	 num2=j;
	 operation=op;	
	 
 }
 }
public class A8_MethodOverloadingDemo_8 {

	public static void main(String[] args) {
		
		Casio obj=new Casio();
		obj.add(1);
		obj.add(1, 2);
		obj.add(1, 2, 3);
		
		//Constructor overloading
		Casio obj1=new Casio();
		Casio obj2=new Casio(5);
		Casio obj3=new Casio(5,6);
		Casio obj4=new Casio(5,6,"hello");
		
		System.out.println(obj1.num1+" " +obj1.num2  +" "+obj1.operation);
		System.out.println(obj2.num1+" " +obj2.num2  +" "+obj2.operation);
		System.out.println(obj3.num1+" " +obj3.num2 +" "+obj3.operation);
		System.out.println(obj4.num1+" " +obj4.num2 +" "+obj4.operation);
	
	}

}
