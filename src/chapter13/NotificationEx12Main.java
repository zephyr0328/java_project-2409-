package chapter13;

import java.util.LinkedList;
import java.util.Queue;

public class NotificationEx12Main {

	public static void main(String[] args) {
		Queue<Notification> noti = new LinkedList<Notification>();
		

		noti.offer(new Notification("�ȳ�", "Phone"));
		noti.offer(new Notification("�׷�", "Mail"));
		noti.offer(new Notification("��", "SNS"));

		while (!noti.isEmpty()) {
			Notification massage = noti.poll();
			System.out.println(massage.recipient + " ����" + massage.action + "�� �����߽��ϴ�.");
			// switch���� ����ϴ� ������ �ӵ��� ������ ������
		}

	}

}
