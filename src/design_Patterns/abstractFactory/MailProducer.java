package design_Patterns.abstractFactory;
/**
 * 邮件生产类
 * @author Tomcatx
 *
 */
public class MailProducer implements Producer{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
