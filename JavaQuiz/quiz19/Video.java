package quiz19;

public class Video implements Runnable{

	int finish = 10;
	
	@Override
	public void run() {

		String a = "";


		for(int i = 1; i <= finish; i++) {

			System.out.print("동영상을 다운로드 합니다:");
			System.out.println( a += "*");

			try {
				Thread.sleep(1100);
			} catch (InterruptedException e) {}
			
		}
		System.out.println("\n다운로드가 완료되었습니다");
	}

	
	
}
