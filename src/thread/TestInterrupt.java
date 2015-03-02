package thread;

import java.util.Date;

/**
 * thread sleep test
 * @author Tomcatx
 *
 */
public class TestInterrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread md = new MyThread();
		md.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//md.interrupt(); 粗暴地打断子线程
		}
	}

}
class MyThread extends Thread{
	boolean flag = true;
	public void run(){
		while(flag){
			System.out.println(new Date());
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				flag = false;//跳出循环，子线程结束
				return;
			}
		}
	}
	
}
