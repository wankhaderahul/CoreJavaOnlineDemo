import java.util.Arrays;
import java.util.List;

//Method Reference

/* JAva concept-- Supported call by value not supported call by reference

 -- >  call by value

-->   CALL BY METHOD
*
*
*
*/

interface Parser{
	
	String parser(String str);
}



class StringParser{
	
	public static String convert(String str) {
		
		if(str.length()<=3) {
			
			str=str.toUpperCase();
		}
		
		else {
			str=str.toLowerCase();
		}
		
		
		return str;
		
	}
	
public  String convert1(String str) {
		
		if(str.length()<=3) {
			
			str=str.toUpperCase();
		}
		
		else {
			str=str.toLowerCase();
		}
		
		
		return str;
		
	}
}


class MyPrinter{
	
	public void  print(String str, Parser p) {
		str=p.parser(str);
		System.out.println(str);
		
	}
	
	
}


public class MethodReferenceDemo {

	public static void main(String[] args) {

/*List<String> value=Arrays.asList("rahul","pravin","manish");

value.forEach(System.out::println);*/
		String str="Rah";
		
		//using method reference static method
		MyPrinter mp=new MyPrinter();
		mp.print(str,StringParser::convert);
		
		//using method reference non static method
		StringParser sp=new StringParser();
		mp.print(str, sp::convert1);
		
		
		////using Anomyous inner class
		Parser p=new Parser() {
			
			@Override
			public String parser(String str) {
				
				return StringParser.convert(str);
			}
		};
		
		mp.print(str, p);
		
		
	////using Anomyous inner class
		mp.print(str, new Parser() {
			
			@Override
			public String parser(String str) {
				// TODO Auto-generated method stub
				 return StringParser.convert(str);
			}
		});
		
		
	////using Lambda expression
mp.print(str,(s) -> StringParser.convert(s));
		
	
	}
	
	
	

}
