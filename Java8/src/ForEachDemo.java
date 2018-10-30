import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PhoneBook{
	
	PhoneBook(int pno,String name){
		this.pno=pno;
		this.name=name;
	}
	
	int pno;
	String name;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

//Java 1.8 foreach() method
public class ForEachDemo {

	public static void main(String[] args) {


		List<Integer> list=Arrays.asList(4,6,5,8);
		
		PhoneBook p=new PhoneBook(1, "rahul");
		PhoneBook p1=new PhoneBook(2, "pankaj");
		
		List<PhoneBook> listPhonebook=new ArrayList<>();
		
		listPhonebook.add(p);
		listPhonebook.add(p1);
		
		//External Loop --> normal for loop and enhanced for loop --> take time to print loop
		
		/*for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}*/

		
		/*for(Integer i:list) {
			System.out.println(i);
		}*/
		
		
		//internal Loop or collection loop --> foreach() --> faster than other for loop -->calling using lambda expression
		
		//list.forEach(i->System.out.println(i));// i->System.out.println(i) --> lambda expression
		
		//list.forEach((i)->System.out.println(i));
		
		//list.stream().forEach(i->System.out.println(i));
		//list.parallelStream().forEach(i->System.out.println(i)); // Unorder
		list.stream().filter(i->i==4 ||i.equals(8) && !(i==null)).forEach(i->System.out.println(i));//o/p 4 8 -->filter
		listPhonebook.forEach(i->System.out.println(i.pno+" "+i.name));
	}

}
