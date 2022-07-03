package hung.com.a4_scan_beans;

import hung.com.a4_scan_beans.bean.GreetingService;
import hung.com.a4_scan_beans.bean.MyCar;
import hung.com.a4_scan_beans.bean.MyComponent;
import hung.com.a4_scan_beans.config.AppConfiguration;
import hung.com.a4_scan_beans.lang.Language;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
//default sẽ scan tất cả các class: là con của package hiện tại "hung"
//@ComponentScan({"com.in28minutes.springboot.basics.springbootin10steps","com.in28minutes.springboot.somethingelse"})
public class App2_web_scan_bean {
	private static final Logger log = LogManager.getLogger();

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App2_web_scan_bean.class, args);


		/**
		 * Test Override @Bean: => mục tiêu là thay đổi cách hành xử của thư viện
		 */
		MyCar myCar = (MyCar)context.getBean(MyCar.class);
		log.debug("car = {}", myCar.getCar()); // override ToyotaCar
	}

}

