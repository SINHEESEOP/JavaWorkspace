package 연습장;

public class Warri extends Player {

    public Warri(int hp) {
        super(hp);
    }

    public void bash() {
        setHp(getHp() - 10);
    }

}
