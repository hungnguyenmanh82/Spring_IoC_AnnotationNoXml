package hung.com.include;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2_ImportConfig {
	public static void main(String[] args) {
		/**
		 * ko dùng Beans.xml => dùng @configuration thay thế nó
		 * ConfigB.class chứa @configuration: dùng để khai báo @bean
		 * -----
		 * ConfigB.class includes ConfigA.class
		 */
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);

		// now both beans A and B will be available...
		BeanA a = (BeanA)ctx.getBean("BeanA");
		BeanB b = (BeanB)ctx.getBean("BeanB");
		
		a.showMessage();
		b.showMessage();
	}
}
