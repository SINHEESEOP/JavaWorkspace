package _08_day.basic2;

public class Person extends God { //부모클래스

	String name;
	int age;
	
	Person(String name, int age) {
		super(); //생략.
		this.name = name;
		this.age = age;
		
//		System.out.println("나는" + this + "입니다");
//		System.out.println( this.info()  );
	}
	
	Person(String name) {
//		this.name = name;
//		this.age = 1;
//		System.out.println("나는" + this + "입니다");
		this(name, 1);
		
	}
	
	Person() {
//		this.name = "이름미정";
//		this.age = 1;
//		System.out.println("나는" + this + "입니다");
		this("이름미정", 1);
	}
	
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
}
