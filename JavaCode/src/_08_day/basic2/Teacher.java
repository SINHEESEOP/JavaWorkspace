package _08_day.basic2;

public class Teacher extends Person {

	String subject; //과목
	
	Teacher(String name, int age, String subject) {
		super(name, age); //
		this.subject = subject;
	}
	
	
	String info() {
		return super.info() + ", 담당과목:" + subject;
	}
}
