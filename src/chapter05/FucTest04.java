package chapter05;

public class FucTest04 {
	
	//반환값이 없음.(void)
	public void channelDown(int volume) {
		System.out.println("소리를 "+volume+"만큼 내립니다.");
	}
	
	//반환값이 있음.
	public int channelUp(int volume) {
		System.out.println("소리를 높이겠습니다.");
		return volume+2;
	}
	public static void main(String[] args) {
		FucTest04 tv = new FucTest04();

		System.out.println("소리를 " + tv.channelUp(5) + "만큼 올립니다.");
		System.out.println("============================");
		int volume = tv.channelUp(9);
		System.out.println("소리를 " + volume + "만큼 올립니다.");

		System.out.println();
		tv.channelDown(5);

	}

}
