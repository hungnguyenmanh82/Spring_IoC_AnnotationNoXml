package hung.com.a3_bean_lifecycle.a1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * sẽ tạo @bean với class này ở @configuration class
 */
public class Demo2Bean {
	private static final Logger log = LogManager.getLogger();

	/**
	 * đây là callback function lifecycle of @Bean(name="foo", initMethod = "init", destroyMethod = "cleanup" )
	 */
	public void init() {
		log.debug("@bean callback lifecycle: init() ");
	}

	/**
	 * đây là callback function lifecycle of @Bean(name="foo", initMethod = "init", destroyMethod = "cleanup" )
	 */
	public void cleanup() {
		log.debug("@bean callback lifecycle: cleanup() ");
	}

}