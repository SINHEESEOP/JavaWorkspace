package _06_day.this_;

public class Student extends Person {

	String studentId; //학번
	//name, age
	
	
	//생성자
	Student(String name, int age, String studentId) {
		//super(); //생략
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}
	
	
}
