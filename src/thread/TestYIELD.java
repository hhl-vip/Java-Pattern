package thread;
/**
 * Thread yield
 * @author Tomcatx
 *
 */
public class TestYIELD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 t1 = new MyThread3("t1");
		MyThread3 t2 = new MyThread3("t2");
		t1.start();t2.start();
	}

}
class MyThread3 extends Thread{
	MyThread3(String name){super(name);}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+" "+i);
			if (i%10==0) {
				yield();
			}
		}
		
	}
}
