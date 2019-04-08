package hung.com.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class ConfigScope {
	@Bean(name="Food")
	@Scope("prototype")  //mỗi lần gọi sẽ khởi tạo 1 biến mới. Khác với Singleton.
	public Food food() {
		//có thể khởi tạo giá trị của BeanA() ở đây ở hàm Constructor hoặc các hàm setter
		return new Food();
	}
}
