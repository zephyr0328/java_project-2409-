package chapter12.string;

public class PersonMain {

	public static void main(String[] args) {

		// ���1
		Person person = new Person();
		System.out.println(person);

		Person person2 = new Person("soldesk");
		System.out.println(person2);

		Person person3 = new Person("soldesk", 17);
		System.out.println(person3);

	}

}
