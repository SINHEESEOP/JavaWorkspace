package api.thread.thread;

//Thread클래스 상속
public class ThreadTest extends Thread {

	int sum;
	
	@Override
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			
			if(getName().equals("A") ) {
				sum++;
			}
			
			System.out.println("쓰레드이름:" + getName() + ", 합계:" + sum);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
		}
		
	}

	
}
