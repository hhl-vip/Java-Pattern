package design_Patterns.commonFactory;
/**
 * 发送工厂类
 * @author Tomcatx
 *
 */
public class SendFactory {
	/**
	 * 工厂生产的方法
	 * @param type 生产类型
	 * @return
	 */
	public Sender produce(String type){
		if ("msg".equals(type)) {
			return new MsgSender();
		}else if ("mail".equals(type)) {
			return new MailSender();
		}else {
			System.out.println("类型不存在");
			return null;
		}
	}
	public static void main(String[] args) {
		SendFactory sf = new SendFactory();
		Sender s = sf.produce("mail");
		s.send();
	}
} 
