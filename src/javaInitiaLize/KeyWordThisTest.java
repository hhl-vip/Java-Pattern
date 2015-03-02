package javaInitiaLize;
/**
 * this 关键字使用规则
 * @author Tomcatx
 *
 */
public class KeyWordThisTest {
	private int i = 0;
	KeyWordThisTest increment() {
		i++;
		return this;
	}
	void print() {
		System.out.println("i = " + i);
	}
	public static void main(String[] args) {
		KeyWordThisTest x = new KeyWordThisTest();
		x.increment().increment().increment().print();
	}
}
