package chapter05;

public class FuncTest_OverloadMain {

	public static void main(String[] args) {
		FuncTest_Overload obj=new FuncTest_Overload();//��ü����
		
		obj.getResult(4);//System.out.println(n + "��(��) int �Դϴ�.");
		obj.getResult('A');
		obj.getResult("������ �Դϴ�.");
		obj.getResult(3, "2024");

	}

}
