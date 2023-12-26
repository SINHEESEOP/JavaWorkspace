package quiz03;

public class ArrayPrint_park {
	/*
	 * Arrays.toString() 의 기능을 따라하기
		1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드
		2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading
		3. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading
	 * 
	 * [ + 값 + , + 값 + , + 값 + ]
	 */
	String toArray(int[] a) {
		
		String str = "[";
		
		for(int i = 0; i < a.length; i++) {
			str += a[i];
			if(i == a.length - 1) break;
			str += ", ";
		}
		
		str += "]";
		
		return str;
	}
	
	String toArray(char[] a) {
		String str = "[";
		
		for(int i = 0; i < a.length; i++) {
			str += a[i];
			if(i == a.length - 1) break;
			str += ", ";
		}
		
		str += "]";
		
		return str;
	}
	
	String toArray(String[] a) {
		String str = "[";
		
		for(int i = 0; i < a.length; i++) {
			str += a[i];
			if(i == a.length - 1) break;
			str += ", ";
		}
		
		str += "]";
		
		return str;
	}
	
	
	
	
}
