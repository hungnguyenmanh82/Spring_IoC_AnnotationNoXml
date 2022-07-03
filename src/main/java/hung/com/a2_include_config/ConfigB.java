package hung.com.a2_include_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * ConfigB include ConfigA
 */
@Configuration
@Import(ConfigA.class)
public class ConfigB {
   @Bean(name="BeanB")
   public BeanB BeanCCC() {
	 //có thể khởi tạo giá trị của BeanA() ở đây ở hàm Constructor hoặc các hàm setter
      return new BeanB(); 
   }
}
