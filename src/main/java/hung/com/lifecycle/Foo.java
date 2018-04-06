package hung.com.lifecycle;

public class Foo {
	public void init() {
		System.out.println("init() ");
	}
	public void cleanup() {
		System.out.println("destroy() ");
	}
}