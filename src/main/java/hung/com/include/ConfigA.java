package hung.com.include;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {
   @Bean
   public BeanA BeanA() {
      return new BeanA(); 
   }
}
