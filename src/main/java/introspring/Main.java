package introspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Basic b = (Basic)ctx.getBean("base");
		
		System.out.println(b.getRollno());
		System.out.println(b.getName());
		System.out.println(b.getList());
    	System.out.println(b.getL());
		System.out.println(b);
		
	}

}
