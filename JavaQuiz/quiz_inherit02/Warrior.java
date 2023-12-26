package quiz_inherit02;

import quiz_inherit02.Player;

public class Warrior extends Player {
	//전사는 생성될 때 ★이름만 매개변수로 받고, hp = 100, mp = 50이 됩니다.
	//전사는 강력한 bash()를 가지고 있습니다
	//bash()는 호출될떄마다 mp를 -10씩 감소시킵니다

	// 생성자가 정상적으로 연결될 수 있도록 부모클래스와 연결
	// bash는 매개변수로 전사 or 마법사가 됩니다.
	// bash스킬 사용하면 나의 mp -100씩 소모가 됩니다.
	// 나의 mp가 100이하면 스킬을 사용할 수 없습니다.
	// 대상이 전사라면 상대방의 hp -100 감소시킴
	// 대상이 마법사라면 상방의 hp -200 감소시킴

	public Warrior (String name) {
		super(name,2000,1000);
	}
	public void bash(Player player) {
		if (player instanceof Warrior && getMp() >= 100) {
			setMp(getMp() - 100);
			player.setHp(player.getHp() - 100);
			System.out.println("배쉬!!");
		}
		if (player instanceof Wizard && getMp() >= 100) {
			setMp(getMp() - 100);
			player.setHp(player.getHp() - 200);
			System.out.println("배쉬!!");
		}
		if (getMp() < 100) {
			System.out.println("마나가 부족합니다.");
		}
	}
	public void info() {
		System.out.println("==========================");
		System.out.println("케릭명:" + getName());
		System.out.println("hp:" + getHp());
		System.out.println("mp:" + getMp());
		System.out.println("==========================");

	}
}
