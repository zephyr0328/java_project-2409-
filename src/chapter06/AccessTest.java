package chapter06;

public class AccessTest {

	// 멤버변수=필드
	private int aa; // 현재 클래스에서만 사용 가능
	public int bb; // 접근지정자 고용(다른 클래스에서도 사용가능)
	int cc; // public생략가능

	// 디폴트 생성자

	// 메서드
	public void setAa(int aa) {// get set 메서드
		this.aa = aa; // 멤버변수 초기화 this 멤버변수를 가르킨다.this 나 그자체 객체를 의미
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void Disp() {
		System.out.println("aa값 : " + aa + "bb값 : " + bb + "cc값 : " + cc);// 초기화 확인

	}

	public static void main(String[] args) {
		AccessTest obj = new AccessTest();

		// aa초기화 방법
		// obj.aa=10;
		// System.out.println("aa=10 -> "+obj.aa);
		obj.setAa(20);
		System.out.println("aa=20 -> " + obj.aa);

		obj.bb = 30;
		System.out.println("bb=30 -> " + obj.bb);

		obj.setCc(40);
		System.out.println("cc=40 -> " + obj.cc);

		obj.Disp();

	}

}
