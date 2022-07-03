package hung.com.a4_scan_beans.config;

import hung.com.a4_scan_beans.override_bean.Car;
import hung.com.a4_scan_beans.override_bean.HondaCar;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import hung.com.a4_scan_beans.lang.Language;
import hung.com.a4_scan_beans.lang.impl.Vietnamese;
import org.springframework.context.annotation.Primary;

/**
 * Thay vì config với XML thì ta config bằng Annotation @Configuration
 * @ComponentScan({"hung.com.Spring.bean"}): scan package này để tìm các @Bean, @service, @component, @repository,...
 */
@Configuration
@ComponentScan(basePackages={"hung.com.a4_scan_beans.bean"})
public class AppConfiguration {
    
    /**
     * tạo 1 bean bất kỳ ở đây vào khởi tạo cho nó
     * Ngoài các bean ở đây, còn có các bean tạo bởi @service, @component, @repository
     * by default: @Bean nếu ko khai báo @Scope là singleton
     */
	@Bean(name ="language")
    public Language getLanguage() {
		//khởi tạo và bean ở đây, đưa giá trị vào bằng java code như thường
        return new Vietnamese();  //class implement Language interface
    }

    /**
     * override @bean singleton đã định nghĩa trc đó => mục tiêu là thay đổi cách hành xử của thư viện
     * xem MyCar.class đã định nghĩa @bean với cùng tên "car" chữ đầu viết thường
     * -------
     * cần thiết lập ở application.yml với spring.main.allow-bean-definition-overriding=true
     */
    @Bean
    @Primary  // override Bean
    public Car getCar(){
        return new HondaCar(); //override bean ở đây xem kết quả thế nào
    }
}
