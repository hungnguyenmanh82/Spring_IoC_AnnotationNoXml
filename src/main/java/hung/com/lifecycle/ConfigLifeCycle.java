package hung.com.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigLifeCycle {
	@Bean(name="foo", initMethod = "init", destroyMethod = "cleanup" )
	public Foo foo() {
		return new Foo();
	}
}
