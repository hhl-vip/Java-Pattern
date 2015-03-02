package thread;

public class TestPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new T1());
		Thread t2 = new Thread(new T2());
		t1.setPriority(Thread.NORM_PRIORITY+4);
		t1.start();t2.start();
	}
	

}
class T1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.println("t1:"+i);
		}
	}
	
}

class T2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.println("t2:"+i);
		}
	}
	
}
