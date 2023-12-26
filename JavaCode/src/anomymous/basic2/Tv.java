package anomymous.basic2;

public class Tv {

	private int volume;
	private RemoteControl remote;
	
	
	public Tv() {
		
		String name = "LG TV"; //지역변수
		
		remote = new RemoteControl() {
			
			//익명객체 안에서는 this키워드 사용이 불가함
			//익명객체 안에서는 지역변수의 값을 변경이 불가능(사용은 가능)
			@Override
			public void volumeUp() {
				
				//name = "이렇게 바꿀래";
				
				Tv.this.volume++; //Tv의 멤버변수에 접근이 가능
				System.out.println(volume);
			}
			
			@Override
			public void volumeDown() {
				volume--;
				System.out.println(volume);
			}
			
			@Override
			public void turnOn() {
				System.out.println("Tv를 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Tv를 끕니다");
			}
		};
		
		
	}
	
	
	//remote을 외부에서 받으려면
	//setter
	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}
	
	//getter
	public RemoteControl getRemote() {
		return remote;
	}
	
	
	
}
