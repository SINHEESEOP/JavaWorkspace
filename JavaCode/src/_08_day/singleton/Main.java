package _08_day.singleton;

public class Main {
    public static void main(String[] args) {
//        Person p = new Person();

        Person p = Person.creatInstance();
        Person p1 = Person.creatInstance();

        p.getPerson();

//        Person p = Person.;
//        Person p2 = Person.getPerson();

        System.out.println(p);
        System.out.println(p1);


    }
}
