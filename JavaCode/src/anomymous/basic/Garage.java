package anomymous.basic;

interface Car {
	public void run();
}


public class Garage {

	//Car인터페이스를 상속받는 클래스(딱 한번만 사용하고, 더이상 사용하지 않을 클래스는 익명객체로 생성할수 있습니다)
	public Car car = new Car() {
		
		@Override
		public void run() {
			System.out.println("this is pride");
		}
	}; 
	
	
	
	
}
