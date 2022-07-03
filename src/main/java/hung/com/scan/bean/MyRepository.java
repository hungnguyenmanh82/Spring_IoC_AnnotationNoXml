package hung.com.scan.bean;

import java.util.Date;

import org.springframework.stereotype.Repository;

/**
 * Thay vì config với XML thì ta config bằng Annotation @Configuration
 * @ComponentScan({"hung.com.Spring.bean"}): scan package này để tìm các @annotation Bean
 */

/**
 * @Repository = @bean singleton
 */
@Repository //singleton Bean dùng chỉ DAO.
public class MyRepository {
 
    public String getAppName() {
        return "Hello Spring App";
    }
 
    public Date getSystemDateTime() {
        return new Date();
    }
     
     
}
