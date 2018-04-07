package hung.com.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class ConfigScope {
	@Bean(name="Food")
	@Scope("prototype")
	public Food food() {
		return new Food();
	}
}
