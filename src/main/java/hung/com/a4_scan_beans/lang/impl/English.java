package hung.com.a4_scan_beans.lang.impl;

import hung.com.a4_scan_beans.lang.Language;

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
	@Override
	public String toString() {
		return this.getClass().getName();
	}

}
