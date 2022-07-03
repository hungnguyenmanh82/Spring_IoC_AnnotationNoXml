package hung.com.a1_configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * sẽ tạo @bean với class này ở @configuration class
 */
public class HelloWorld {
	private static final Logger log = LogManager.getLogger();
	private String message;

	public void setMessage(String message){
		this.message  = message;
	}
	public void getMessage(){
		log.debug("Your Message : " + message);
	}
}
