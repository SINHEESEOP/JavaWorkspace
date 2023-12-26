package quiz15;

import java.util.*;

public class MapQuiz02 {

	public static void main(String[] args) {
		
		//메뉴관리 프로그램
		//맵을 사용하고 메뉴명을 key, 가격을 value 사용합니다.

		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new TreeMap<>();

		while(true) {
			
			System.out.println("-----메뉴관리-----");
			System.out.println("1. 메뉴등록 (이미 등록된 메뉴인지 확인후에 등록)");
			System.out.println("2. 전체 메뉴 보기");
			System.out.println("3. 메뉴수정 (변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정)");
			System.out.println("4. 메뉴삭제 (변경할 메뉴를 받아서 메뉴가 있다면 삭제");
			System.out.println("5. 프로그램종료");

			System.out.println("메뉴명>");
			String menu = sc.next();

			switch (menu) {
				case "1":
					System.out.println("등록할 음식을 입력해주세요>");
					String food = sc.next();
					System.out.println("등록할 음식의 가격을 입력해주세요>");
					Integer price = sc.nextInt();
					if (!(map.containsKey(food))) {
						map.put(food, price);
					} else {
						System.out.println("해당 메뉴가 있으니 다른 메뉴를 입력해주세요.");
					}
					break;
				case "2":
					if (map.size() == 0) {
						System.out.println("등록된 음식이 없습니다.");
						break;
					}

//					Map.Entry<String, Integer> entrySet = map.entrySet();

					for (Map.Entry<String, Integer> entry : map.entrySet()) { // 왜 되는거임? set 타입으로 안받아도?
						System.out.println("음식 : " + entry.getKey() + " 가격 : " + entry.getValue());
					}
					break;
				case "3":
					System.out.println("가격을 변경할 음식을 입력해주세요>");
					String food1 = sc.next();
					System.out.println("변경할 가격을 입력 해주세요>");
					Integer price1 = sc.nextInt();
					if (map.containsKey(food1)) {
						map.put(food1, price1);
					} else {
						System.out.println("해당 메뉴는 없습니다.");
					}
					break;
				case "4" :
					System.out.println("삭제할 음식을 입력해주세요.");
					String food3 = sc.next();
					if(map.containsKey(food3)) {
						map.remove(food3);
					}
					else {
						System.out.println("해당 음식은 없습니다.");
					}
			}

		}
		
		
		
		
	}
}
