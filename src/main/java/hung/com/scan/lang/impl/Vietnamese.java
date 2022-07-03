package hung.com.scan.lang.impl;

import hung.com.scan.lang.Language;

//English
public class Vietnamese  implements Language {

	@Override
	public String getGreeting() {
		return "xin chao";
	}

	@Override
	public String getBye() {
		return "tam biet";
	}


}
