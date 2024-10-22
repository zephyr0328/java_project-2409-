package chapter06;

public class Cafe {
	public String name;
	public int sales;
	//생성자
	public Cafe(String name) {
		this.name = name;
	}
	//메서드
	public void sell(int amount) {//음료 구매후 카페의 수익증가)
	 sales+=amount;
	}
	public void showInfo() {
	
	System.out.println(name+ "카페의 매출은 "+sales+"원 입니다.");	
	}

}

