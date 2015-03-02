package thread;

public class TT implements Runnable{
	int b = 100;
	private synchronized void m1() throws Exception{
		// TODO Auto-generated method stub
		b =1000;
		Thread.sleep(5000);
		System.out.println("b="+b);

	}
	private void m2() {
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
		TT tt = new TT();
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
 * 先走主线程，到副线程被启动后，两个线程并发执行，
 * 副线程要睡眠5秒，主线程睡眠1秒，所以m2先执行完，m1再执行。
 */
