package hung.com.include;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ConfigA.class)
public class ConfigB {
   @Bean(name="BeanB")
   public BeanB BeanCCC() {
      return new BeanB(); 
   }
}
