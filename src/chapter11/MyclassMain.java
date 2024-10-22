package chapter11;

public class MyclassMain {

	public static void main(String[] args) {
		
		Myclass mClass=new Myclass();
		
		X xClass=mClass;
		xClass.x();
		System.out.println();
		Y yClass=mClass;
		yClass.y();
		System.out.println();
	}
}
