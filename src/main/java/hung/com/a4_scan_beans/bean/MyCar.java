package hung.com.a4_scan_beans.bean;

import hung.com.a4_scan_beans.override_bean.Car;
import hung.com.a4_scan_beans.override_bean.ToyotaCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyCar {

    @Autowired
    public Car getAutowiredCar;


    /**
     * Trong @Component, @service, @Repository có thể khai báo @Bean như bình thường
     */
    @Bean
    private Car initCar(){
        return new ToyotaCar();
    }

    public Car getCar(){
        return getAutowiredCar;
    }
}
