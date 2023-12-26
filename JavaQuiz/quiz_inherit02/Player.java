package quiz_inherit02;

public class Player {
    private String name;
    private int hp;
    private int mp;

    public Player(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public void info() {
        System.out.println("케릭명 : " + name);
        System.out.println("hp : " + hp);
        System.out.println("mp : " + mp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}