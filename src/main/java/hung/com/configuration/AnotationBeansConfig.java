package hung.com.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration: là file chứa tất cả các @bean để Spring biết đc nhắm khởi tạo Prototy Pattern
 *
 */
@Configuration
public class AnotationBeansConfig {
	private static final Logger log = LogManager.getLogger();

	/**
	 * tất cả các Bean phải được khai báo ở đây
	 * Nên đặt tên giống Class name để có thể Jump tới Class dễ dàng từ Eclipse
	 * Nếu ko khai báo bean name thì lấy tên class luôn.
	 * Default: @Bean là singleton. Lần 1 goi sẽ trả về new instance, lần 2 gọi sẽ trả về instance lần đầu.
	 * @Scope để xác định là singleton hay ko
	 * ---
	 * name: là id của bean. Trong trường hợp có nhiều bean cho 1 interface thì sẽ dùng @autowired @qualifier(nameId)
	 * trường hợp ko khai báo name, thì chỉ có 1 instance
	 */
	@Bean(name ="HelloWorld")  
	public HelloWorld helloWorld(){
		// dùng exception để xem call stack
//		log.debug("@bean create = {}", new Exception("new") );

		//có thể khởi tạo giá trị của BeanA() ở đây ở hàm Constructor hoặc các hàm setter
		return new HelloWorld();
	}
}
