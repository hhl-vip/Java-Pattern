package thread;
/**
 * 多线程死锁机制
 * @author Tomcatx
 *
 */
public class TestDeadLock implements Runnable{
	public int flag = 1;
	static Object o1 = new Object(),o2 = new Object();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDeadLock tdl1 = new TestDeadLock();
		TestDeadLock tdl2 = new TestDeadLock();
		tdl1.flag=1;
		tdl2.flag=0;
		Thread t1 = new Thread(tdl1);
		Thread t2 = new Thread(tdl2);
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("flag:"+flag);
		if (flag==1) {
			synchronized (o1) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("1");
				}
			}
			
		}
		if (flag==0) {
			synchronized (o2) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (o1) {
					System.out.println("0");
				}
			}
			
		}
	}

}
