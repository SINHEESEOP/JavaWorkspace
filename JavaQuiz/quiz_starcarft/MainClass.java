package quiz_starcarft;

public class MainClass {

	public static void main(String[] args) {
		
		DropShip s = new DropShip();
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		
		s.ride(t1);
		s.ride(t2);
		s.move(10, 10);
		
		//탱크 위치 확인
		t1.location();
		t2.location();
		
		
		
		
	}
}
