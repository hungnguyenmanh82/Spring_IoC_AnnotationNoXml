package hung.com.a2_include_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {
   @Bean(name="BeanA")
   public BeanA BeanA() {
	   //có thể khởi tạo giá trị của BeanA() ở đây ở hàm Constructor hoặc các hàm setter
      return new BeanA(); 
   }
}
