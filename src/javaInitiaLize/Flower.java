package javaInitiaLize;

public class Flower {
	private int petalCount = 0;
	private String s = new String("null");
	Flower(int petals) {
	petalCount = petals;
	System.out.println("Constructor w/ int arg only, petalCount= "
			+ petalCount);
	}
	Flower(String ss) {
	System.out.println(
	"Constructor w/ String arg only, s=" + ss);
	s = ss;
	}
	Flower(String s, int petals) {
	this(petals);
	//! this(s); // Can't call two!
	this.s = s; // Another use of "this"
	System.out.println("String & int args");
	}
	Flower() {
	this("hi", 47);
	System.out.println(
	"default constructor (no args)");
	}
	void print() {
	//! this(11); // Not inside non-constructor!
	System.out.println(
	"petalCount = " + petalCount + " s = "+ s);
	}
	public static void main(String[] args) {
		Flower x = new Flower();
		x.print();
	}
}
/**
 * 尽管可用this 调用一个构建器，
但不可调用两个。除此以外，构建器调用必须是我们做的第一件事情，否则会收到编译程序的报错信息。
这个例子也向大家展示了this 的另一项用途。由于自变量s 的名字以及成员数据s 的名字是相同的，所以会
出现混淆。为解决这个问题，可用this.s 来引用成员数据。
 */