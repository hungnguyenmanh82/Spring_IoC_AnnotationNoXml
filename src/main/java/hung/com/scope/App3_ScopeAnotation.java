package hung.com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hung.com.lifecycle.ConfigLifeCycle;
import hung.com.lifecycle.Foo;

public class App3_ScopeAnotation {
	public static void main(String[] args) {

		/**
		 * ko dùng Beans.xml => dùng @configuration thay thế nó
		 * ConfigScope.class chứa @configuration: dùng để khai báo @bean
		 */
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigScope.class);

		Food food = (Food)ctx.getBean("Food");
		food.init();
	}
}
