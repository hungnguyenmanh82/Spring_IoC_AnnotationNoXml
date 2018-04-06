package hung.com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hung.com.configuration.AnotationBeansConfig;
import hung.com.configuration.HelloWorld;

public class App4_LifeCycle {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigLifeCycle.class);

		Foo foo = ctx.getBean(Foo.class);
	}

}
