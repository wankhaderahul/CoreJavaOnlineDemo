/*
*  Imp Link access specifier:- https://www.quora.com/What-is-the-basic-difference-between-access-specifier-and-access-modifier-in-Java
*    https://www.google.com/imgres?imgurl=https://qph.fs.quoracdn.net/main-qimg-da076fc27ef10e5b8e05e7d252e183e6&imgrefurl=https://www.quora.com/What-is-the-basic-difference-between-access-specifier-and-access-modifier-in-Java&h=450&w=602&tbnid=XFjDNSoX-aRN3M:&q=what+is+access+specifier+and+access+modifier+in+java&tbnh=157&tbnw=211&usg=AI4_-kQxkja4owWmXqL-UR3m-sk1yx5QCg&vet=12ahUKEwi9neah5e7dAhXZV30KHQP5CM8Q9QEwAHoECAsQBg..i&docid=e2A3PiEvQE4sPM&client=firefox-b-ab&sa=X&ved=2ahUKEwi9neah5e7dAhXZV30KHQP5CM8Q9QEwAHoECAsQBg#h=450&imgdii=XFjDNSoX-aRN3M:&tbnh=157&tbnw=211&vet=12ahUKEwi9neah5e7dAhXZV30KHQP5CM8Q9QEwAHoECAsQBg..i&w=602
*/
public class A1_VeriableDemo_1 {

	public static void main(String[] args) {

		
		
	 long l=5000_0000_0000l;	//8 byte  --> 64 bit  --> any number
	 System.out.println(l);
     int i=2_147_483_647; // 4 byte  --> 32 bit  --> -2,14,74,83,648 to 2,147,483,647 -->9 digit allow only
     System.out.println(i);
     short s=32767; // 2 byte  --> 16 bit --> -32768 to 32767
     System.out.println(s);
     byte b=-128;  // 1 byte  --> 8 bit --> -128 to 127
     //byte b1=(byte) 129; -- cross limit rang then u can cast
     float f=5.5f; // 4 byte  --> 32 bit
     double d=5.5;  // 8 byte  --> 64  bit
     
     char c='A'; // 2 byte 16 bit --> 8 bit for ASCII and 8 bit for char
     int z=c;
     System.out.println(" Z :"+z);
     
     c=66; //ASCII American standard code for information interchange
     //c++;
     System.out.println(c); //o/p B
     
     double d1=5; //Implicit conversion 
     System.out.println(d1); // o/p = 5.0
     
     int k=(int) 5.5; // Explicit conversion --> Type casting
     System.out.println(k);//o/p 5
     
     float f1=5; //Implicit conversion 
     System.out.println(f1); // o/p = 5.0
     
     boolean bl = false; //default value false
     System.out.println(bl);
     
     // Diagram Assign value support 
     
     // byte --> short --> int --> long --> float --> double
     
               // char -->int 
     //boolean
	}
	
	byte t=127;
	short st=32767;
	int it=2_14_74_83_64;
	long lg=1234567891012l;
	float ft=23456.78954f;
	double bd=2344556778913323d;

}
