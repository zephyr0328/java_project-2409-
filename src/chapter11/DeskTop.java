package chapter11;
//상속을 받기 위해서는 body가 존재해야함 -> 반드시 오버라이딩 해야함
public class DeskTop extends Computer{
	
	@Override
	public void display() {
	System.out.println("DestTop");
	}

	@Override
	public void typing() {
	System.out.println("DeskTop");
	}

}
