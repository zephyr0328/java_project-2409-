package chapter05;

public class Example02 {
	/*�� ������ �Է¹޾Ƽ�(=�Ű�����) �� ���� ����ϴ� �޼ҵ带 �����غ�����.*/
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
		//��ȯ���� �ִ� �޼���
		int sum=obj.add1(num1, num2);
		System.out.println(sum);
		//��ȯ���� ����
		obj.add2(num1, num1);
	}

}
