/* Encapsulation

* " Binding data with method "
* 
* variable are private
*
* ex:- in eclipse entity private variable setter getter method
*
* access the variable using getter and setter 
* 
* 
* data is safe using encapsulation ex:- private variable 
*
* data is assign with method ex:- obj.setRollno(5);
* 
*  
*  also maintain log file using method
*/

class Students{
	
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		System.out.println(" log file --> user assign value");
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class B7_EncapsulationDemo_16 {

	public static void main(String[] args) {

     Students obj=new Students();
     obj.setRollno(11);
     obj.setName("rahul");
     System.out.println(" roll no : "+obj.getRollno()+" name: "+obj.getName());

	}

}
