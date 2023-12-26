package ramda.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.greeting( new Say01() {
			@Override
			public void talking() {
				System.out.println("hello");
			}
		});
		
		p.greeting( new Say01() {
			@Override
			public void talking() {
				System.out.println("안녕하세요");
			}
		});
		
		p.greeting( new Say01() {
			
			@Override
			public void talking() {
				System.out.println("니쉬팔로마");
			}
		});
		
		System.out.println("---------------------------------");
		
		//함수적인터페이스를 구현하는 익명객체를 -> 람다식으로 표현이 가능
		p.greeting( () -> { System.out.println("hello"); });
		p.greeting( () -> System.out.println("안녕하세요") 	  ); //표현할 코드가 한줄이면 {}생략이 됩니다
		
		
		System.out.println("---------------------------------");
//		String r = p.greeting( new Say02() {
//			@Override
//			public String talking() {
//				return "hello";
//			}
//		} );
		
		String r = p.greeting( () -> "hello" ); //한줄이면서, return이 생략되면 자동으로 return됩니다
		System.out.println(r);
		
		
		System.out.println("---------------------------------");
		
//		int r2 = p.greeting( new Say03() {
//			@Override
//			public int talking(String a, int b) {
//				//처리할 코드
//				int sum = 0;
//				for(int i = 1; i <= b; i++) {
//					sum += i;
//				}
//				return sum;
//			}
//		});
		
		
		int r2 = p.greeting( (a, b) -> { //자동타입추론 ()안에는 타입을 생략합니다. 매개변수가 1개라면 ()도 생략가능합니다
			
			int sum = 0;
			for(int i = 1; i <= b; i++) {
				sum += i;
			}
			return sum;
		});
		
		System.out.println(r2);
		
	}
}
