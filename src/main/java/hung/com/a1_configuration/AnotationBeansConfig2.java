package hung.com.a1_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration: là file chứa tất cả các @bean để Spring biết đc nhắm khởi tạo Prototy Pattern
 *
 */
@Configuration
public class AnotationBeansConfig2 {
	/**
	 * Nên đặt tên giống Class name để có thể Jump tới Class dễ dàng từ Eclipse
	 * Nếu ko khai báo bean name thì lấy tên class luôn.
	 * Default: @Bean là singleton. Lần 1 goi sẽ trả về new instance, lần 2 gọi sẽ trả về instance lần đầu.
	 * @Scope để xác định là singleton hay ko
	 * ---
	 * name: là id của bean. Trong trường hợp có nhiều bean cho 1 interface thì sẽ dùng @autowired @qualifier(nameId)
	 * trường hợp ko khai báo name, thì chỉ có 1 instance
	 * Trường hợp ko khai báo id thì sẽ lấy tên của method làm id
	 */
	@Bean(name ="abc")
	public HelloWorld helloWorld(){
		//có thể khởi tạo giá trị của BeanA() ở đây ở hàm Constructor hoặc các hàm setter
		return new HelloWorld();
	}
}
