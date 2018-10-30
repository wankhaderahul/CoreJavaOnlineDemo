import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Set;

//DateTime in java 8
/*

Disadvantages of 1.8 previous date

-->previous two type sql and util date -->two packages in same classes

Date d=new Date();

-->import one more package java.lang.text
*
*-->not thread safe
*
*
*1.8 Date Time advantages
*
*-->Date and Time Immutable
*-->special package import java.time.LocalDate or Localtime
*
*
*
*
*/

public class DateTimeDemo {

	public static void main(String[] args) {

  LocalDate d=LocalDate.now();
  //System.out.println(d);
  
  
  LocalDate d1=LocalDate.of(1991,02, 05);
  LocalDate d2=LocalDate.of(1991,Month.FEBRUARY, 05);//Month is Enum
  //LocalDate d3=LocalDate.of(1991,Month.FEBRUARY, 29);//RT error -->Invalid date 'February 29' as '1991' is not a leap year
  //System.out.println(d2);
  
  
  LocalTime t=LocalTime.now();
  LocalTime t1=LocalTime.of(12, 45);
 
  //System.out.println(t);
  
  Set<String> z=  ZoneId.getAvailableZoneIds();
  
  for(String s:z) {
	  
	  System.out.println(s);
  }
  
  LocalTime z1=LocalTime.now(ZoneId.of("Asia/Aqtau"));
  System.out.println(z1);
  
  Instant i=  Instant.now();
  System.out.println(i);
  
	}

}
