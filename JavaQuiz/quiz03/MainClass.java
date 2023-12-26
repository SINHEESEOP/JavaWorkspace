package quiz03;

import quiz03.ArrayPrint_park;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		char[] arr2 = {'a', 'b', 'c' };
		
		ArrayPrint_park ap = new ArrayPrint_park();

		System.out.println( ap.toArray(arr)  );
		System.out.println( ap.toArray(arr2) );
		
		String z = "zerozero";

		System.out.println(z.replace("zero","0"));


	}
	
	
}
