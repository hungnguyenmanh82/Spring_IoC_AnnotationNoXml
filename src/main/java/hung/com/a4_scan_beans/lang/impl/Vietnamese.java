package hung.com.a4_scan_beans.lang.impl;

import hung.com.a4_scan_beans.lang.Language;

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

	@Override
	public String toString() {
		return this.getClass().getName();
	}
}
