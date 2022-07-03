package hung.com.a6_bean_override;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class childBean {
	private static final Logger log = LogManager.getLogger();

	public void show() {
		log.debug("show()");
	}

}