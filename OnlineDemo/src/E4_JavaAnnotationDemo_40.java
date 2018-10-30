import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

//Marker Annotation
//Single value annotation
//Multi  value annotation
//Meta Annotation

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone //Marker Annotation
{
	
	//String os() default  "Symbine";
	//int version() default  7;
	
	String os();
	int version();
}

@SmartPhone(os = "Android", version = 6)
class NokiaASeries{
	
	String model;
	int size;
	
	public NokiaASeries(String model,int size) {
		this.model=model;
		this.size=size;
	}
}

@FunctionalInterface
interface In{
	
	void display();
}

class Cl{
	
	public void show() {
		
	}
}


class Bl extends Cl{
	
	@Override
	public void show() {
		
		@SuppressWarnings(value = { "" })
		List list=new ArrayList();
		
	}
	
}
public class E4_JavaAnnotationDemo_40 {

	public static void main(String[] args) {

		NokiaASeries obj=new NokiaASeries("Fire",5);
		Class c=obj.getClass();
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone) an;
		System.out.println(s.version());

	}

}
