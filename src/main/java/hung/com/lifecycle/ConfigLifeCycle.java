package hung.com.lifecycle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration: là file chứa tất cả các @bean để Spring biết đc nhắm khởi tạo Prototy Pattern
 *
 */
@Configuration
public class ConfigLifeCycle {
	private static final Logger log = LogManager.getLogger();

	/**
	 * khai báo tên các method callback lifecyle ở đây
	 *
	 */
	@Bean(name="foo", initMethod = "init", destroyMethod = "cleanup" )
	public Foo foo() {
		//có thể khởi tạo giá trị của BeanA() ở đây ở hàm Constructor hoặc các hàm setter

		return new Foo();
	}
}
