package hung.com.a4_scan_beans.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hung.com.a4_scan_beans.lang.Language;

/**
 * Thay vì config với XML thì ta config bằng Annotation @Configuration
 * @ComponentScan({"hung.com.Spring.bean"}): scan package này để tìm các @annotation Bean
 */
@Service //singleton
public class GreetingService {
    private static final Logger log = LogManager.getLogger();
    /**
     * @Autowired: là reference tới 1 @bean đã đc khởi tạo trc đó rồi.
     * nếu ko có @bean nào của Language interface này đc khởi tạo trc đó, nó sẽ trả về null
     */
   @Autowired
   private Language language;
 
   public GreetingService() {
 
   }
 
   public void sayGreeting() {

       log.debug("@Autowired: Language = {} ",  language);
   }
 
}
