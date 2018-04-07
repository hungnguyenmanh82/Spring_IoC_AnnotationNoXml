package hung.com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration: là file chứa tất cả các @bean để Spring biết đc nhắm khởi tạo Prototy Pattern
 *
 */
@Configuration
public class AnotationBeansConfig {
   /**
    * tất cả các Bean phải được khai báo ở đây
    * Nên đặt tên giống Class name để có thể Jump tới Class dễ dàng từ Eclipse
    */
	@Bean(name ="HelloWorld")
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}
