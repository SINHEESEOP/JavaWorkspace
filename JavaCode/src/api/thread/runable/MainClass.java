package api.thread.runable;

public class MainClass {

	public static void main(String[] args) {
		
		//메인도 하나의 쓰레드로 동작을 합니다.
		
		//쓰레드를 동작시키려면 Thread객체를 생성합니다.
		
		//객체 2개, 쓰레드 2개 (각각 실행됨)
		ThreadTest t = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		
		Thread thread = new Thread(t, "A");
		thread.start();

		Thread thread2 = new Thread(t2, "B");
		thread2.start();
		
		
		
		System.out.println("main쓰레드 종료");
		
		
	}
}
