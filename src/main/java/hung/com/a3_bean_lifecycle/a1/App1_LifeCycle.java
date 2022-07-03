package hung.com.a3_bean_lifecycle.a1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1_LifeCycle {

	public static void main(String[] args) {
		/**
		 * ko dùng Beans.xml => dùng @configuration thay thế nó
		 * ConfigLifeCycle.class chứa @configuration: dùng để khai báo @bean
		 */
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigLifeCycle.class);

//		Foo foo = ctx.getBean(Foo.class);
		DemoBean foo = (DemoBean)ctx.getBean("foo");
	}

}
