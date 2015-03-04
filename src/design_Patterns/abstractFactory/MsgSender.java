package design_Patterns.abstractFactory;
/**
 * 短信发送实现类
 * @author Tomcatx
 *
 */
public class MsgSender implements Sender{

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("this is msg send");
	}

}
