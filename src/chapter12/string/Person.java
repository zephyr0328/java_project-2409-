package chapter12.string;

public class Person {

	public String name;
	public int age;

	public Person() {
	}
	Person(String name){
		this.name=name;
	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
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

	@Override
	public String toString() {
		return name + ", " + age;
	}

}
