package chapter05;

public class Example01 {
	/* �簢���� ���̸� ����ϴ� �޼ҵ�  calculateArea �� �����ε� �Ͽ� ���ο� ���α���,
	�׸��� �� ���� ���̸� �޾Ƽ� ����� �� �ְ� ��������.
	�簢�� ���� ���(���簢��) = ���� x ����(�Ű����� 2��) ���� 5, ���� 3 
	�簢�� ���� ���(���簢��) = �� ���� ���� x �� ���� ����(�Ű����� 1��)  �� ���� ���� 4 */
	
	public double calculateArea(double n1,double n2) {
		double area=n1*n2;
		return area;
	}
	public double calculateArea(double n1) {
		double area=n1*n1;
		return area;
	}

	public static void main(String[] args) {
		//��ü���� �ϱ� 
				Example01 rectangle = new Example01();	
				double area1 = rectangle.calculateArea(5.0, 3.0);
				double area2 = rectangle.calculateArea(4.0);		
				System.out.println("�簢���� ���� (����5, ���� 3): "+ area1);
				System.out.println("���簢���� ���� (�� ���� ����4): "+area2);

	}

}
