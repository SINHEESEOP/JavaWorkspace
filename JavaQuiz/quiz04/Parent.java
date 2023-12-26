package quiz04;

public class Parent {
    String father;
    String mother;

    Parent() {

    }

    Parent(String father, String mother) {
        this.father = father;
        this.mother = mother;
    }

    void info() {
        System.out.println("아부지 : " + father + " 어머니 : " + mother);
    }
}
