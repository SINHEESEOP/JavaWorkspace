package api.lang.objcetClass;

public class Person implements Cloneable{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // 간편 오버라이딩 단축키

    // ctrl + O

    // 오버라이딩 - 객체안에 변수를 빠르게 확인하기 위해서 오버라이딩하여 많이 사용함
    @Override
    public String toString() {
        return super.toString();
    }

    // 오버라이딩 - obj가 Person인 경우, 매개변수의 name과 나의 name이 같으면 true 반환
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person)obj;

//            String name = p.getName();
            if (p.name.equals(this.name)) { // p.name or p.getName 도 가능.
                return true;
            }
        }
        return false;
    }

    // finalize - deprecate (언제 없어질지 모르니 왠만하면 사용하지 마세요.)
    // 오바라이딩 - 객체가 메모리에서 해제될 때 자동으로 볼려나가는 메소드
    // 단, 시점 자체가 정확하지 않아서 deprecate 되었다.
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + "님이 소멸했습니다.");
        super.finalize();
    }

    // 많이 사용되진 않음,
    // 오버라이딩 = 객체를 복사해서 반환
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
