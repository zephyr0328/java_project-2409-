package chapter08;

public class Guide {
	//멤버변수
	static String point;
	Guest[] guest;
	
	//생성자
	public Guide(int n) {
		//목적지(발리)
		point="발리";
		//관광객 수 만큼 메모리확보
		guest=new Guest[n];
		for(int i=0;i<n;i++) {
			guest[i]=new Guest();
		}
		
	}
	
	//메서드
	public static String getPoint() {
		return point;
	}

	

	
	

}
/*
스테틱 변수 point를 가지는 Guide클래스를 만들고, 
이름과 성별 정보를 갖는 Guest 클래스를 만들어 아래의 결과가 나오도록 하는 로직을 구현
최초 실행시 등록할 관광객 수를 지정.
지정한 수 만큼 Guest클래스의 배열로 만듬
*/