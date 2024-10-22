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
		System.out.println("두 수의 합: "+su);
	}
	// 합계 메서드 구현
	public static void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("두 수의 합: " + sum);
	}

	public static void main(String[] args) {
		// 두 수의 합
		FuncTest01 obj=new FuncTest01();
		
		int a, b;

		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		/*
		 * int sum=a+b; System.out.println("두 수의 합: "+sum);
		 */

		sum(a, b);// a,b : 실매개변수
		obj.sum2(a, b);
		
		
		
	}// main

}// class
