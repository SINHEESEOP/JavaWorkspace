package quiz_inherit02;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        // 생성자가 정상적으로 연결될 수 있도록 부모클래스와 연결
        // bash는 매개변수로 전사 or 마법사가 됩니다.
        // bash스킬 사용하면 나의 mp -100씩 소모가 됩니다.
        // 나의 mp가 100이하면 스킬을 사용할 수 없습니다.
        // 대상이 전사라면 상대방의 hp -100 감소시킴
        // 대상이 마법사라면 상방의 hp -200 감소시킴

        //1. 생성자가 정상적으로 연결될 수 있도록 부모클래스와 연결
        //2. iceArrow
	/*
		3. blizzard(Player[] arr) 메소드 광역스킬
		Player[] 에 있는 대상에 hp를 1 ~ 10씩 랜덤하게 깍아줌.
	 */

        Warrior p1 = new Warrior("전사1");
        Warrior p2 = new Warrior("전사2");
        Wizard w = new Wizard("마법사1");
        Player[] pArr = {p1, p2};
        Scanner sc = new Scanner(System.in);



        while (true){
            String a = sc.next();
            if (a.equals("p1")) {
                w.icdArrow(p1);
                p1.info();
            }
        }
    }
}
