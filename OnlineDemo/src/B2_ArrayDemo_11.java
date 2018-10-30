/* Array 
 * --> collection of similar type of elements -->work on Index 0 1 2 3 --
*   Types-> one/multi/jagged dimentional array
*     
*     Size is fixed in Array
*/
class Student{
	 int rollno;
	 String name;
}

public class B2_ArrayDemo_11 {
	
	public static void main(String[] args) {
		
		
		// one dimensional array
		int num[]=new int[4];
		
		//int num[]={1,2,3,4};
		
		num[0]=11;
		num[1]=22;
		num[2]=33;
		num[3]=43;
		//num[4]=1; //java.lang.ArrayIndexOutOfBoundsException: 4 
		System.out.println(num[2]);// o/p 33
		
		for(int i:num) {
			System.out.println(i); // o/p 11 22 33 44
		}
		
		
		
		Student s1=new Student();
		s1.rollno=111;
		s1.name="rahul";
		
		Student s2=new Student();
		s2.rollno=222;
		s2.name="suresh";
		
		Student s3=new Student();
		s3.rollno=333;
		s3.name="sachin";
		
		Student s4=new Student();
		s4.rollno=444;
		s4.name="rahul";
		
		// One dimensional array
		Student s[]= {s1,s2,s3,s4};
		
		for(Student ss:s) {
			if(ss.rollno==333) {
				continue;//skip 333
			}
			System.out.println(" roll no: " +ss.rollno+ " name : "+ss.name); 
		}
		
		// two dimensional array ---> same size row and column
		
		
		Student aaa[]= {s1};
		Student bbb[]= {s2};
		Student ccc[]= {s3};
		
		Student ss[][]= {aaa,bbb,ccc};
		
		int aa[]= {1,2,3,4};
		int bb[]= {2,4,6,8};
		int cc[]= {3,6,9,12};
		
		//int d[][]= {aa,bb,cc};
		
		//or
		
		/*int d[][]= {
				
				{1,2,3,4},
				{2,4,6,8},
				{3,6,9,12}
				};*/
		
int d[][]= { // Jagged array ---> different size row and column
				
				{1,2,3,},
				{2,4,6,8},
				{3,6,9,12,7}
				};
		
		for(int i[]:d) {// row        -->  this loop is enhanced for loop
			
			for(int j:i) { //column
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}
		
       for(Student i[]:ss) {// row        -->  this loop is enhanced for loop
			
			for(Student j:i) { //column
				System.out.print(" "+j.rollno +" "+j.name);
			}
			System.out.println(" ");
		}
	}

}
