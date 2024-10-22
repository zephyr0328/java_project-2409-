package chapter09;

public class Childmain {

	public static void main(String[] args) {
		Child obj = new Child();

		obj.method1();
		obj.method2();
		obj.method3();
		System.out.println();

		Parent obj1 = new Parent();
		obj1.method1();
		obj1.method2();

		System.out.println();
		// Parent parent2=obj;
		Parent patent2 = new Child();// ºÎ¸ð²¨ ¶Ç´Â overrideµÈ ¸Þ¼­µå
		patent2.method1();// ºÎ¸ð²¨
		patent2.method2();// ÀÚ½Ä²¨

	}

}
