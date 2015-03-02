package thread;

public class TT2 implements Runnable{
	int b = 100;
	private synchronized void m1() throws Exception{
		// TODO Auto-generated method stub
		b =1000;
		Thread.sleep(5000);
		System.out.println("b="+b);

	}
	private synchronized void m2() {
		// TODO Auto-generated method stub
		System.out.println(b);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		TT2 tt = new TT2();
		Thread t = new Thread(tt);
		t.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tt.m2();
	}
		
}
/**
 * m1执行时，m2不能执行；m2执行的时，m1不能执行
 */
