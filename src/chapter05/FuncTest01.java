package chapter05;

import javax.swing.JOptionPane;

public class FuncTest01 {

	public void xx3(int num1,int num2) {
		int xx=num1*num2;
		System.out.println(xx);
	}
	
	
	public void sum2(int num1,int num2) {
		int sum=num1+num2;
		System.out.println(sum);
		FuncTest01 obj=new FuncTest01();
		obj.xx3(num1, num2);
		
	}

	
	
	
	
	public static  void sum1(int num1,int num2) {
		int su=num1+num2;
		System.out.println("�� ���� ��: "+su);
	}
	// �հ� �޼��� ����
	public static void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("�� ���� ��: " + sum);
	}

	public static void main(String[] args) {
		// �� ���� ��
		FuncTest01 obj=new FuncTest01();
		
		int a, b;

		a = Integer.parseInt(JOptionPane.showInputDialog("��1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("��2"));
		/*
		 * int sum=a+b; System.out.println("�� ���� ��: "+sum);
		 */

		sum(a, b);// a,b : �ǸŰ�����
		obj.sum2(a, b);
		
		
		
	}// main

}// class
