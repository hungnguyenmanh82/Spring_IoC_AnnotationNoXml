package hung.com.a6_bean_override;

import hung.com.a5_bean_scope.Food;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigAutowired {
	@Bean(name="Food")
	public Food food() {
		//có thể khởi tạo giá trị của BeanA() ở đây ở hàm Constructor hoặc các hàm setter
		return new Food();
	}
}
