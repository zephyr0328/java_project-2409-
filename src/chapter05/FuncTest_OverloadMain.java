package chapter05;

public class FuncTest_OverloadMain {

	public static void main(String[] args) {
		FuncTest_Overload obj=new FuncTest_Overload();//객체생성
		
		obj.getResult(4);//System.out.println(n + "은(는) int 입니다.");
		obj.getResult('A');
		obj.getResult("월요일 입니다.");
		obj.getResult(3, "2024");

	}

}
