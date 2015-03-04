package design_Patterns.abstractFactory;
/**
 * 邮件发送实现类
 * @author Tomcatx
 *
 */
public class MailSender implements Sender{

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("this is mail send");
	}

}
