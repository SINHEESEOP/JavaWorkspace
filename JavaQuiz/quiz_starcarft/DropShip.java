package quiz_starcarft;

public class DropShip extends Unit {
	
	//유닛을 담을 배열
	private Unit[] arr = new Unit[8];
	private int index = 0; //배열을 다룰 인덱스
	
	
	public DropShip() {
		super(0, 0, 150);
	}

	@Override
	public void location() {
		System.out.println("수송선 위치:" + getX() + ", " + getY());
	}

	@Override
	public void move(int x, int y) {
		
		//나의 위치변경
		setX(x);
		setY(y);
		angimotti();
		//1. 수송선이 이동하면, 수송선 x,y 위치로 모든 유닛의 위치를 변경
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] != null) {
				//나의 위치 = getX(), getY()
				arr[i].setX( getX() );
				arr[i].setY( getY() );
			}
		
		}
		
		
	}

	//2. 유닛 탑승기능
	/*
	 * void ride(Unit unit)
	 * 
	 * 1. 유닛을 배열에 저장
	 * 2. 탱크는 배열의 크기를 4칸씩 사용, 마린은 배열의 크기를 1칸씩 사용. (객체타입 확인 instanceof)
	 * 3. 배열이 전부차거나, 해당 유닛이 탈수 있는 공간이 없으면 "드랍쉽에 공간이 부족합니다" 출력
	 * 4. 수송선에 탑승한 유닛을 가로로 출력
	 * 
	 * 5. main에 확인하기
	 */
	
	public void ride(Unit unit) {
		
		//마린이 배열에 들어갈 수 있는 조건
		if(unit instanceof Marine && index <= 7 ) {
			arr[index] = unit;
			index++;
		
		//탱크가 배열에 들어갈 수 있는 조건
		} else if(unit instanceof Tank && index <= 4) {
			arr[index] = unit;
			index+=4;
			
		} else {
			System.out.println("드랍쉽에 공간이 부족합니다");
		}
		
		//탑승 유닛을 가로로 출력
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] instanceof Marine) {
				System.out.print("마린 ");
			} else if(arr[i] instanceof Tank) {
				System.out.print("탱크 ");
			}
			
		}
		System.out.println();
		
		
		
	}
	
	
	
	
	
	
	
}
