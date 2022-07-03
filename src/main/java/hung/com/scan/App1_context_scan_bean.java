package hung.com.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hung.com.scan.bean.GreetingService;
import hung.com.scan.bean.MyComponent;
import hung.com.scan.config.AppConfiguration;
import hung.com.scan.lang.Language;


/**
 * vd này là java app sử dụng thư viên Spring-context = spring-beans + spring-core + spring-aop + spring-expression
 */
public class App1_context_scan_bean {
	 
	   public static void main(String[] args) {
	 
	       /**
	        * ApplicationContext là Context interface lấy các @bearn từ Map
	        * AppConfiguration.class: chứa tất cả các khai bào @bean (@component, @repository, @service...)
	        */
	       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
	 
	       //====================================== vd1:
	       System.out.println("----------");
	       Language language = (hung.com.scan.lang.Language) context.getBean("language");
	      
	       System.out.println("Bean Language: "+ language);
	       System.out.println("Call language.sayBye(): "+ language.getBye());
	      
	       //====================================== vd2:
	       System.out.println("----------");
	       GreetingService service = (GreetingService) context.getBean("greetingService"); // chữ đầu tiên là chữ thường
	       service.sayGreeting();
	  
	       //================================== vd3:
	       System.out.println("----------");
	       MyComponent myComponent = (MyComponent) context.getBean("myComponent"); // chữ đầu tiên là chữ thường
	       myComponent.showAppInfo();
	      
	   }
	  
	}

