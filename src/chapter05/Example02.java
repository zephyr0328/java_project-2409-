package chapter05;

public class Example02 {
	/*두 정수를 입력받아서(=매개변수) 그 합을 계산하는 메소드를 구현해보세요.*/
	public int add1(int a,int b) {
		return a+b;
	}
	public void add2(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Example02 obj=new Example02();
		
		int num1=10;
		int num2=20;
		//반환값이 있는 메서드
		int sum=obj.add1(num1, num2);
		System.out.println(sum);
		//반환값이 없음
		obj.add2(num1, num1);
	}

}
