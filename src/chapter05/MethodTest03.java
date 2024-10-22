package chapter05;

public class MethodTest03 {
	public static int add(int i, int j) {
		int sum=i+j;
		return sum;
	}
	public static void main(String[] args) {
		int result = add(5,7); //실 매개변수
		System.out.println("Result  : "+ result);
	}
}
