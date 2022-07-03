package hung.com.scan.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
@component đc cụ thể hóa bằng @service, @controller, @Repository => nghĩa là nó có thể thay thế 3 annotation trên => nên khai báo cụ thể nó là loại @bean cụ thể nào, ko nên dùng @component.
Cả 4 cái trên đều là spring bean => có nghĩa là Spring IoC sẽ hỗ trợ khởi tạo nó.
@component nếu ko luôn là Singleton dù khai báo @scope là gì đi nữa. @scope chỉ có nghĩa với @bean mà thôi.
Việc phân loại Bean giúp cho Spring dễ dàng tìm kiếm, ưu tiên và hỗ trợ các Annotation tự động gen source code thôi.
@service thực chất là Bean mang tính hình thức design (để chỉ 1 singleton đc khởi tạo ngay từ đầu giống android service, hay angular service), nó ko có nhiều ý nghĩa về nội dung như @controller và @repository.

@Component = @bean singleton
 */
@Component
public class MyComponent {
    
    @Autowired   //refer to a singleton @bean đã đc khởi tạo rồi
    private MyRepository repository;
 
    public void showAppInfo() {
        System.out.println("Now is: "+ repository.getSystemDateTime());
        System.out.println("App Name: "+ repository.getAppName());
    }
 
}