package quiz19;

public class MainClass {

	public static void main(String[] args) {
		
		//힌트 - 2개의 객체, 2개의 쓰레드

		Music v1 = new Music();
		Video v2 = new Video();
				
		Thread t1 = new Thread(v1);
		Thread t2 = new Thread(v2);
		
		t1.start();
		t2.start();
		
		
		
	}
}
