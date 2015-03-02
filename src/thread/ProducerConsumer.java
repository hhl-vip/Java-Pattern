package thread;
/**
 * 生产者消费者经典现象
 * @author Tomcatx
 *
 */
public class ProducerConsumer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncStack ss = new SyncStack();
		Producer p  = new Producer(ss);
		Consumer c = new Consumer(ss);
		new Thread(p).start();new Thread(c).start();
	}

}
class Producer implements Runnable{
	SyncStack ss = null;
	Producer(SyncStack ss){
		this.ss = ss;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			WoTou wt = new WoTou(i);
			ss.push(wt);
			System.out.println("生产了:"+wt);
			try {
				Thread.sleep((int)(Math.random()*200));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Consumer implements Runnable{
	SyncStack ss = null;
	Consumer(SyncStack ss){
		this.ss = ss;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
				for (int i = 0; i < 20; i++) {
					WoTou wt = ss.pop();
					System.out.println("消费了:"+wt);
					try {
						Thread.sleep((int)(Math.random()*1000));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	}
	
}
class SyncStack{
	int index = 0;
	WoTou [] arrWT = new WoTou[6];
	public synchronized void push(WoTou wt) {
		// TODO Auto-generated method stub
		while (index ==arrWT.length ) {
			try {
				this.wait();//当窝窝头装满了，需要线程等待
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();//当跳出wait循环后线程需要被唤醒
		arrWT[index] = wt;
		index ++;
	}
	public synchronized WoTou pop() {
		// TODO Auto-generated method stub
		while (index ==0) {//当窝窝头用光了，需要线程等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		this.notify();//当跳出wait循环后线程需要被唤醒
		index --;
		return arrWT[index];
		
	}
	
}
class WoTou{
	
	int id; 
	WoTou(int id){
		this.id = id;
	}
	public String toString(){
		return "woTou:"+id;
	}
}


