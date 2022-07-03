package hung.com.lifecycle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * sẽ tạo @bean với class này ở @configuration class
 */
public class Foo {
	private static final Logger log = LogManager.getLogger();

	/**
	 * đây là callback function lifecycle of @bean
	 */
	public void init() {
		log.debug("@bean callback lifecycle: init() ");
	}

	/**
	 * đây là callback function lifecycle of @bean
	 */
	public void cleanup() {
		log.debug("@bean callback lifecycle: cleanup() ");
	}
}