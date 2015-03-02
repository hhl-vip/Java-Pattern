package thread;
/**
 * extends Thread
 * @author Tomcatx
 *
 */
public class Thread_DEMO2 {
	public static void main(String[] args) {
			
			Runner2 r = new Runner2();
		
			r.start();
			for (int i = 0; i < 100; i++) {
				System.out.println("main thread:"+i);
			}
		}
}
class Runner2 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("runner2 thread:"+i);
		}
	}
	
	
}