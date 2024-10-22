package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

		// CellPhone으로부터 상속 받은 필드
		System.out.println("모델명 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);

		// DmbCellPhone의 필드
		System.out.println("채널: " + dmbCellPhone.channel);

		// CellPhone으로부터 상속받은 메서드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("안녕");
		dmbCellPhone.receiveVoice("안녕하세요");
		dmbCellPhone.hangUp();

		// DmbCellPhone의 메서드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(15);
		dmbCellPhone.turnOffDmb();

	}

}
