package hung.com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration: là file chứa tất cả các @bean để Spring biết đc nhắm khởi tạo Prototy Pattern
 *
 */
@Configuration
public class AnotationBeansConfig2 {
	/**
	 * tất cả các Bean phải được khai báo ở đây
	 */
	@Bean(name ="abc")
	public HelloWorld helloWorld(){
		//có thể khởi tạo giá trị của BeanA() ở đây ở hàm Constructor hoặc các hàm setter
		return new HelloWorld();
	}
}
