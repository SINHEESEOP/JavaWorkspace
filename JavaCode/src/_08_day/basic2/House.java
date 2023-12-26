package _08_day.basic2;

public class House {

    //멤버변수 - Person을 저장할 수 있는 배열
    //String[] arr =  new String[3];
    // 접근제한자는 없으면 디폴트값이며, static 도 붙을 수 있다.
    private Person[] arr = new Person[10];
    private int i = 0;

    // Person 객체를 받아서 배열 멤버변수에 저장한다.
    public void addPerson (Person p) {
        arr[i] = p;
        i++;
    }


    // Person 객체의 정보를 출력합니다.
    public void printPerson (Person p) { // 매개변수로 Student 와, Teacher 등 다 가능. 단 그렇게 될 경우 자기 자신만 받을 수 있음.
        System.out.println(p.info());
    }
    public void printPerson (Person[] person) {
        for (int i = 0; i < person.length; i++) {
            Person p = person[i];
            System.out.println(p.info());
        }
    }

}
