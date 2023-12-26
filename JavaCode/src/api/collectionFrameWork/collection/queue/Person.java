package api.collectionFrameWork.collection.queue;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 비교의 우선순위를 주기위한 메소드
    @Override
    public int compareTo(Person o) {
        // 문자비교
        // 올림차순
        return this.name.compareTo(o.getName());
        // 내림차순
//        return o.getName().compareTo(this.name);
        // age 로 비교하고 싶다?
//        return Integer.compare(this.age, o.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
