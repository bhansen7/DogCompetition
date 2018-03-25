package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 ClassPathXmlApplicationContext applicationContext = new
		 ClassPathXmlApplicationContext("beans/beans.xml");
		 EntryService entryService = applicationContext.getBean("entryService",EntryService.class);
		 
		System.out.println("Entry Info before move up: "  + entryService.getEntry(1).toString()); 
		
		entryService.moveUpClass(1);
		
		System.out.println("Entry Info after move up: " + entryService.getEntry(1).toString());

	}

}
