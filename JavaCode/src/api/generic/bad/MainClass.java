package api.generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		ABC abc = new ABC();
		
		abc.setObj("피카츄");
		String name = (String)abc.getObj();
		System.out.println(name);
		
		//만약 사용할 때 잘못캐스팅 하면 예외가 발생.
		//Integer age = (Integer)abc.getObj();
		
		abc.setObj( new Person()  );
		Person p = (Person)abc.getObj();

		
		
		
		
		
		
		
		
		
	}
}
