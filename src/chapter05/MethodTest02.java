package chapter05;

public class MethodTest02 {
	
	public static String greet(String a) {
		System.out.println(a);
		return "나";
	}

	public static void main(String[] args) {
		
		String name="최백설";
		greet(name);
		

	}

}
