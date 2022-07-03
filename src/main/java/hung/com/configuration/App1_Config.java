package hung.com.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1_Config {
	private static final Logger log = LogManager.getLogger();

	public static void main(String[] args) {
		/**
		 * ko dùng Beans.xml => dùng @configuration thay thế nó
		 * AnotationBeansConfig.class chứa @configuration: dùng để khai báo @bean
		 */
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnotationBeansConfig.class);
		
		//HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		HelloWorld helloWorld = (HelloWorld)ctx.getBean("HelloWorld");
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();

		log.debug("@bean Hello = {}", helloWorld); // xem Address có khác ở dưới ko
		
		//===========================================================================================
		/**
		 * ko dùng Beans.xml => dùng @configuration thay thế nó
		 * AnotationBeansConfig.class chứa @configuration: dùng để khai báo @bean
		 */
		ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AnotationBeansConfig2.class);
		HelloWorld abc = (HelloWorld)ctx2.getBean("abc");
		log.debug("@bean Hello = {}", abc); // xem Address có khác ở dưới ko

		abc.setMessage("Đây là ở Spring context 2");
		abc.getMessage();
	}
}
