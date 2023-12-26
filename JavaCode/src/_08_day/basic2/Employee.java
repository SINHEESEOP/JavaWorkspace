package _08_day.basic2;

public class Employee extends Person {

	String department; //부서
	
	Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	String info() {
		return super.info() + ", 부서정보:" + department;
	}
	
}
