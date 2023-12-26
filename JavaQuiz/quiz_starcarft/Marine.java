package quiz_starcarft;

public class Marine extends Unit {

	//모든 마린이 동일한 6을 갖는다.
	public static int attack = 6;
	public static int armor = 0;
	

	//생성자
	public Marine() {
		super(0, 0, 40);
	}
	
	
	@Override
	public void location() {
		System.out.println("마린의 위치:" + getX() + ", " + getY());
	}

	@Override
	public void move(int x, int y) {
		
		setX(x);
		setY(y);
	}

}
