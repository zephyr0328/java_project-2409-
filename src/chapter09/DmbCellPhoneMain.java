package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);

		// CellPhone���κ��� ��� ���� �ʵ�
		System.out.println("�𵨸� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);

		// DmbCellPhone�� �ʵ�
		System.out.println("ä��: " + dmbCellPhone.channel);

		// CellPhone���κ��� ��ӹ��� �޼��� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("�ȳ�");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���");
		dmbCellPhone.hangUp();

		// DmbCellPhone�� �޼��� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(15);
		dmbCellPhone.turnOffDmb();

	}

}
