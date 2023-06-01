package in.ineuron.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	
	//spring core Annotation
	public static void main(String[] args) 
	{
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//		Apple apple=(Apple) context.getBean("phone");
//	    apple.config();
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Apple apple=context.getBean(Apple.class);
	    apple.config();
		
	}

}
