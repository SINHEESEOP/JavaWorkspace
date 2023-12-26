package anomymous.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		
		tv.getRemote().turnOn();
		tv.getRemote().volumeUp();
		tv.getRemote().turnOff();
		
		
	}
}
