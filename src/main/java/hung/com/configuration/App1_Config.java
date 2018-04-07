package hung.com.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1_Config {
	public static void main(String[] args) {
		//ko dùng Beans.xml => dùng @configuration thay thế nó
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnotationBeansConfig.class);
		
		//HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		HelloWorld helloWorld = (HelloWorld)ctx.getBean("HelloWorld");
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
		
		
		//===========================================================================================
		System.out.println("==================================== Spring context 2 ==============");
		ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AnotationBeansConfig2.class);
		HelloWorld abc = (HelloWorld)ctx2.getBean("abc");
		abc.setMessage("Đây là ở Spring context 2");
		abc.getMessage();
	}
}
