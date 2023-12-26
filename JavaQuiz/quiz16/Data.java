package quiz16;

public class Data {
  private String name;
  private int age;
  private String email;
  private String area;

    public Data(String[] a) {
        this.name = a[0];
        this.age = Integer.parseInt(a[1]);
        this.email = a[2];
        this.area = a[3];
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
