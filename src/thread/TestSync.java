package thread;
/**
 * 线程同步
 * @author Tomcatx
 *
 */
public class TestSync implements Runnable{
	Timer timer = new Timer();
	public static void main(String[] args) {
		TestSync ts = new TestSync();
		Thread t1 = new Thread(ts);
		Thread t2 = new Thread(ts);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}
	public void run() {
		// TODO Auto-generated method stub
		
		timer.add(Thread.currentThread().getName());
	}
}
class Timer{
	static int num=0;
	public synchronized void add(String name) {//执行方法过程中，当前对象被锁定
		// TODO Auto-generated method stub
		//synchronized(this){//执行方法过程中，当前对象被锁定
			num++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		//}
		System.out.println(name+" "+"你是第"+num+"个执行的线程");
		
	}
}