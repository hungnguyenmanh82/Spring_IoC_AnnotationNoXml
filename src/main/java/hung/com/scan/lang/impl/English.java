package hung.com.scan.lang.impl;

import hung.com.scan.lang.Language;

//English
public class English  implements Language {

	@Override
	public String getGreeting() {
		return "Hello";
	}

	@Override
	public String getBye() {
		return "Bye bye";
	}


}
