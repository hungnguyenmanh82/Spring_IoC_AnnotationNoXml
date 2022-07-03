package hung.com.a4_scan_beans;

import hung.com.a4_scan_beans.bean.MyCar;
import hung.com.a4_scan_beans.override_bean.Car;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hung.com.a4_scan_beans.bean.GreetingService;
import hung.com.a4_scan_beans.bean.MyComponent;
import hung.com.a4_scan_beans.config.AppConfiguration;
import hung.com.a4_scan_beans.lang.Language;


/**
 * vd này là java app sử dụng thư viên Spring-context = spring-beans + spring-core + spring-aop + spring-expression
 */
public class App1_context_scan_bean {
	private static final Logger log = LogManager.getLogger();

	public static void main(String[] args) {

		/**
		 * ApplicationContext là Context interface lấy các @bearn từ Map
		 * AppConfiguration.class: chứa tất cả các khai bào @bean (@component, @repository, @service...)
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		//====================================== vd1:
		Language language = (hung.com.a4_scan_beans.lang.Language) context.getBean("language");

		log.debug("@Bean Language = {} ", language);
		log.debug("Call language.sayBye(): "+ language.getBye());

		//====================================== vd2:
		GreetingService service = (GreetingService) context.getBean("greetingService"); // chữ đầu tiên là chữ thường
		service.sayGreeting();  // test xem @autowired lamf việc

		//================================== vd3:
		MyComponent myComponent = (MyComponent) context.getBean("myComponent"); // chữ đầu tiên là chữ thường
		myComponent.showAppInfo();

		MyCar myCar = (MyCar)context.getBean(MyCar.class);
		log.debug("car = {}", myCar.getCar()); // override not work: ToyotaCar
	}

}

