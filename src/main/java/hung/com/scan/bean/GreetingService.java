package hung.com.scan.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hung.com.scan.lang.Language;

/**
 * Thay vì config với XML thì ta config bằng Annotation @Configuration
 * @ComponentScan({"hung.com.Spring.bean"}): scan package này để tìm các @annotation Bean
 */
@Service //singleton
public class GreetingService {
 
   @Autowired
   private Language language; //tự động khởi tạo khi new GreetingService
 
   public GreetingService() {
 
   }
 
   public void sayGreeting() {
        
       String greeting = language.getGreeting();
 
       System.out.println("Greeting: " + greeting);
   }
 
}
