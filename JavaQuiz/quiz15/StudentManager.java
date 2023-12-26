package quiz15;

import java.util.*;

public class StudentManager {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/////////////////////////////////////////////////////////////
		//////////////////////리스트를 생성하세요///////////////////////////
		/////////////////////////////////////////////////////////////

		List<User> list = new LinkedList<>();

		//현재 고객수가 몇명이 저장되어있는지 알기 위한 변수.
		int count = 0;
		
		ex:while(true) {
			
			//메뉴
			System.out.println("[Info]-고객수:" + count);
			System.out.println("[메뉴]1.추가, 2.전체보기, 3.정보검색, 4.정보수정, 5.정보삭제, 6.나가기");
			System.out.print("메뉴입력>");
			String menu = scan.next();
			
			switch(menu) {
			
			case "1":
				System.out.println("=========고객 정보 입력==========");
				/*
				 * 1. 이름과, 나이를 입력받고, 배열에 순서대로 값을 저장합니다.
				 * 2. count값을 증가
				 * 
				 */

				String name = scan.next();
				int age = scan.nextInt();

				User user = new User(name, age);
				list.add(user);

				System.out.println("=============================");
				break;
			case "2":
				System.out.println("========전체 고객정보 출력=========");
				/*
				 * 1. 배열에 저장된 고객정보 "name~님의 나이는 age입니다." 전부출력 
				 */

				System.out.println(list.toString());
			
				System.out.println("=============================");
				break;
			case "3":
				System.out.println("==========고객 정보 검색==========");
				/*
				//찾을 이름을 입력받습니다. 이름이 있다면, 이름과 나이를 출력합니다.
				//찾는 이름 v 없다면 "~~님은 목록에 없습니다" 를 출력합니다.
				 */

				String name2 = scan.next();

				for (User u : list) {
					if (u.getName().equals(name2)) {
						System.out.println(u.getName() + u.getAge());
					} else {
						System.out.println(name2 + " 님은 없습니다.");
					}
				}
				System.out.println("=============================");
				break;
			case "4":
				System.out.println("==========고객 정보 수정=========");
				/*
				 * 1. 모든 list에 저장된 정보를 출력해줍니다.
				 * 2. 수정할 index를 입력 받습니다.
				 * 3. 수정할 name, age으로 수정합니다.
				 */


				System.out.println(list.toString());
				System.out.println("수정할분 위치 찍어주십쇼");
				int index = scan.nextInt();
				System.out.println("수정할 이름 입력해주세여");
				String name22 = scan.next();
				int age2 = scan.nextInt();

				User user1 = new User(name22, age2);
				list.set(index, user1);


				System.out.println("=============================");
				break;
			case "5":
				System.out.println("==========고객 정보 삭제==========");
				/*
				 * 1. 먼저 모든 name을 출력해서 볼 수 있게 처리
				 * 2. 삭제할 이름을 입력을 받습니다.
				 * 3. 이름이 있다면 객체 삭제
				 */

				String name3 = scan.next();

				for (Iterator<User> iter = list.iterator(); iter.hasNext();) { // 잘못 사용하나보다..
					String str = String.valueOf(iter.next());
					if (str.equals("name2")) {
						iter.remove();
					}
				}
				
				System.out.println("=============================");
				break;
			case "6":
				System.out.println("=============================");
				System.out.println("===========프로그램 종료==========");
				System.out.println("=============================");
				
				//while탈출 하면 됩니다.
				break ex;
			default :
				System.out.println("===========================");
				System.out.println("========메뉴는 숫자로 입력=======");
				System.out.println("===========================");
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
	}
}
