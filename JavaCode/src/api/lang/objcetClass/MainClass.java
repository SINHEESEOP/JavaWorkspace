package api.lang.objcetClass;

public class MainClass {
    public static void main(String[] args) {

        Person p = new Person ("홍길동"); // 객체1

        String str = p.toString();
        System.out.println(str);

        int hash = p.hashCode();
        System.out.println(hash); // 해쉬 알고리즘을 사용해서 객체의 고유한 주소에 따라서 중복없는 고유한 숫자를 반환

        System.out.println("===========================================================");

        Person p2 = new Person("홍길동"); // 객체2

        boolean result = p.equals(p2);
        System.out.println(result);

        System.out.println("===========================================================");

        try {
            Person o = (Person)p.clone();
            System.out.println(o.toString());
            System.out.println("원본객체 : " + p);
            System.out.println("클론객체 : " + o);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("====================================================");
        p = null;
        System.gc(); // 가비지컬렉터 호출 // 객체가 사라질때 호출되는 메소드
    }
}
