package _08_day.basic2;

public class Student extends Person {

	String studentId; //학번
	//name, age
	
	
	//생성자
	Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	String info() {
		return super.info() + ", 학번:" + studentId;
	}



	
}
