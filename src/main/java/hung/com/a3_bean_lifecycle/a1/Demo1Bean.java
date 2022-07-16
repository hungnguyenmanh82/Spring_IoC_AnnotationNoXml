package hung.com.a3_bean_lifecycle.a1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * sẽ tạo @bean với class này ở @configuration class
 * -----
 * Dùng Annotation @PostConstruct và @PreDestroy là dễ nhìn nhất
 * -----
 * ứng dụng:
 */
public class Demo1Bean {
	private static final Logger log = LogManager.getLogger();

	@PostConstruct
	public void init() {
		log.debug(" @PostConstruct");
	}

	@PreDestroy
	public void cleanup() {
		log.debug("@PreDestroy ");
	}

}