package chapter06;

public class StdInfo {

	public String studentName;
	public int grade;
	public int money;
	
	public StdInfo(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
//����
	public void takeBus(Bus bus) {
		bus.take(1400);
		this.money-=1400;
	}
	//����ö
	public void takeSubway(Subway subway) {
		subway.take(1800);
		this.money-=1800;
	}
	//�ܾ�
	public void showInfo() {
		System.out.println("�ܾ�"+money);
	}

}
