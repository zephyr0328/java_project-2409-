package chapter05;

import javax.swing.JOptionPane;

public class FuncTest02 {
	
	public void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("�� ���� ��: " + sum);
}

	public static void main(String[] args) {
		
		int a,b;
		a = Integer.parseInt(JOptionPane.showInputDialog("��1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("��2"));
		
		FuncTest02 obj=new FuncTest02();
		obj.sum(a, b);
		
			

	}
	/*//�޸� ����(����)
		//data����
		//���� ���� ����, ���� ������
		//���α׷� ���� �� �ڵ����� �޸� ������ �����ؼ� ���α׷� ���� �� �Ҹ�
		int globalVar=10; 
	
		//stack ����	
		//�޼���, ��������
		//ȣ���ϸ� �����ǰ� �Լ��� ����Ǹ� �Ҹ�
		void myFun() {
			int localVal=5; // ��������
		}
		
		//heap  �޸�
		//��ü ����, �����ϴ� �޸�
		//����ڰ� ȣ�� �� �����ǰ� ����� ����Ǹ� �Ҹ�
		FncTest02 obj=new FuncTest02();
		*/
}
