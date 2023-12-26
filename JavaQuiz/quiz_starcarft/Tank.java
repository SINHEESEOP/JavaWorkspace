package quiz_starcarft;

public class Tank extends Unit{

	//생성자
	public Tank() {
		super(0, 0, 150);
	}

	@Override
	public void location() {
		System.out.println("탱크의 위치:" + getX() + ", " + getY());
	}

	@Override
	public void move(int x, int y) {
		setX(x);
		setY(y);
	}
	
	//탱크만의 기능
	public void changeMode() {
		System.out.println("시즈모드 변환");
	}
	
	
	
}
