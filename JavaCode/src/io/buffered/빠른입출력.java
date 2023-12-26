package io.buffered;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class 빠른입출력 {

	public static void main(String[] args) {
		
		//Scanner는 편의를 위해서 만들어진 클래스.
		//System.out.println도 편의 위해서 만들어진 메서드.
		
		//빠른입력
		
		try {
			
//
//			InputStreamReader a = new InputStreamReader(System.in);
//
//			Reader r = new InputStreamReader(System.in);
			
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
			
			System.out.println(br.readLine());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
