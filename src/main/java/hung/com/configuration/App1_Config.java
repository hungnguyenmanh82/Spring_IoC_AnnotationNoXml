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
	}
}
