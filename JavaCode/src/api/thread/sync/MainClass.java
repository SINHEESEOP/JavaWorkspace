package api.thread.sync;

public class MainClass {

	public static void main(String[] args) {
		
		//동기화 - 한번에 하나의 작업 
		//비동기화 - 한번에 여러개의 작업을 동시에 진행함
		
		ThreadTest t = new ThreadTest();
		
		Thread thread1 = new Thread(t, "A");
		Thread thread2 = new Thread(t, "B");
		
		thread1.start();
		thread2.start();
		
		System.out.println("main스레드 종료");
	}
}
