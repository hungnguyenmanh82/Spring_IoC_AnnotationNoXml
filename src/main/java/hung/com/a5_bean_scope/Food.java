package hung.com.a5_bean_scope;

public class Food {
	public void init() {
		System.out.println("init() ");
	}
	public void cleanup() {
		System.out.println("destroy() ");
	}
}