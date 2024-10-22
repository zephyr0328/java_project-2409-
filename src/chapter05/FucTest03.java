package chapter05;

public class FucTest03 {

	//Display 메서드로 출력
	public void Display1(String arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
	}
	public static void display2(String arr1[]) {
		for(int j=0;j<arr1.length;j++) {
			System.out.print(arr1[j]+"  ");
		}
	}
	
	public static void main(String[] args) {
		String str[]= {"Java", "Oracle", "JSP", "HTML5", "CSS", "SpringBoot"};
		
		FucTest03 obj=new FucTest03();
		obj.Display1(str);
		
		display2(str);
		
	}

}
