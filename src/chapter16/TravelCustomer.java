package chapter16;

public class TravelCustomer {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " +name + " 나이 : " + age + " 가격 : " + price;
	}

	private String name;
	private int age;
	private int price;

	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
