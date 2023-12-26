package _06_day.this_;

public class Person  { //부모클래스

	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println("나는" + this + "입니다");
		System.out.println( this.info()  );
	}
	
	Person(String name) {
//		this.name = name;
//		this.age = 1;
//		System.out.println("나는" + this + "입니다");
		this(name, 1);
		
	}
	Person () {

	}

	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
}
