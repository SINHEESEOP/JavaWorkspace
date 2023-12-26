package quiz_inherit02;

import quiz_inherit02.Player;

public class Wizard extends Player {
 	// Player클래스로 상속관계를 만들어 주세요
	// 마법사는 생성될 때 ★이름만 매개변수로 받고, hp = 50, mp = 100이 됩니다.
	// 마법사는 강력한 iceArrow()를 가지고 있습니다
	// iceArrow()는 호출될떄마다 mp를 -20씩 감소시킵니다

	//1. 생성자가 정상적으로 연결될 수 있도록 부모클래스와 연결
	//2. iceArrow
	/*
		3. blizzard(Player[] arr) 메소드 광역스킬
		Player[] 에 있는 대상에 hp를 1 ~ 10씩 랜덤하게 깍아줌.
	 */

	Wizard (String name) {
		super(name,1000,2000);
	}
	public void icdArrow(Player player) {
		if (getMp() >= 100) {
			setMp(getMp() - 200);
			player.setHp(player.getHp() - 300);
			System.out.println("아이스 에로우!!");
		} else {
			System.out.println("마나가 부족합니다.");
		}
	}

	public void blizzard(Player[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int a = (int) (Math.random() * 100);
			arr[i].setHp(arr[i].getHp() - a);
			System.out.println(arr[i].getName() + " 님의 체력이 " + a + " 깍였습니다." );
		}
		System.out.println("-------------------------------");
	}

	public void info() {
		System.out.println("==========================");
		System.out.println("케릭명:" + getName());
		System.out.println("hp:" + getHp());
		System.out.println("mp:" + getMp());
		System.out.println("==========================");
	}
}
