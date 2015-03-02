package thread;

public class Thread_DEMO1 {
	public static void main(String[] args) {
		
		Runner1 r = new Runner1();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("main thread:"+i);
		}
	}
}
class Runner1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("runner1 thread:"+i);
		}
	}
	
	
}
