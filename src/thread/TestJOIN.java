package thread;
/**
 * thread JOIN
 * @author Tomcatx
 *
 */
public class TestJOIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 mt = new MyThread2("thread2");
		mt.start();
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("i am main thread");
		}
	}

}
class MyThread2 extends Thread{
	MyThread2(String threadName){
		super(threadName);
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i am "+getName());
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}
		}
	}
}
