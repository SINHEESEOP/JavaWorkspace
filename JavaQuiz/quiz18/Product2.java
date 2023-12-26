package quiz18;

public class Product2 {

	//getter, setter를 가지는 멤버변수
	private String num;
	private String store;
	private String grade;
	private String price;
	private String detail;
	
	public Product2() {
	}

	public Product2(String num, String store, String grade, String price, String detail) {
		super();
		this.num = num;
		this.store = store;
		this.grade = grade;
		this.price = price;
		this.detail = detail;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Product [num=" + num + ", store=" + store + ", grade=" + grade + ", price=" + price + ", detail="
				+ detail + "]";
	}
	
	
	
	
	
}
