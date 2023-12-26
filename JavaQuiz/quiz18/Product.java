package quiz18;

public class Product {

//		 * 2. Product객체(날짜, 지점, 등급, 내용, 가격) 을 가지는 생성을 합니다.

    private String day;
    private String branch;
    private String content;
    private String price;

    public Product(String[] line) {
        this.day = line[0];
        this.branch = line[1];
        this.content = line[2];
        this.price = line[3];
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "day='" + day + '\'' +
                ", branch='" + branch + '\'' +
                ", content='" + content + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
