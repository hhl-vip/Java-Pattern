package design_Patterns.abstractFactory;

public class Test {
	public static void main(String[] args) {
		Producer p = new MsgProducer();
		Sender s = p.produce();
		s.send();
	}
}
