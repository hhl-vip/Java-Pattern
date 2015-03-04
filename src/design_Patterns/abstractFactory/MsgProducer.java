package design_Patterns.abstractFactory;

public class MsgProducer implements Producer{
	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MsgSender();
	}
}
