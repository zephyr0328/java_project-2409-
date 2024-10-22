package chapter05;

import javax.swing.JOptionPane;

public class FuncTest02 {
	
	public void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("두 수의 합: " + sum);
}

	public static void main(String[] args) {
		
		int a,b;
		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		FuncTest02 obj=new FuncTest02();
		obj.sum(a, b);
		
			

	}
	/*//메모리 구조(영역)
		//data영역
		//전역 변수 저장, 정적 데이터
		//프로그램 시작 시 자동으로 메모리 영역에 존재해서 프로그램 종료 시 소멸
		int globalVar=10; 
	
		//stack 영역	
		//메서드, 지역변수
		//호출하면 생성되고 함수가 종료되면 소멸
		void myFun() {
			int localVal=5; // 지역변수
		}
		
		//heap  메모리
		//객체 생성, 참조하는 메모리
		//사용자가 호출 시 생성되고 사용이 종료되면 소멸
		FncTest02 obj=new FuncTest02();
		*/
}
