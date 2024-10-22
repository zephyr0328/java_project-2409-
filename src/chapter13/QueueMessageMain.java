package chapter13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMessageMain {

	public static void main(String[] args) {

		Queue<Message> message = new LinkedList<Message>();

		// offer �Է�
		message.offer(new Message("sendmail", "�ֹ鼳"));
		message.offer(new Message("sendSMS", "��Ƹ�"));
		message.offer(new Message("sendkakaotalk", "�ڼ���"));
		// poll ���
		while (!message.isEmpty()) {
			Message m = message.poll();

			switch (m.command) {
			case "sendkakaotalk":
				System.out.println(m.to + "����" + m.command + "�� �����߽��ϴ�.");
				break;
			case "sendmail":
				System.out.println(m.to + "����" + m.command + "�� �����߽��ϴ�.");
				break;
			case "sendSMS":
				System.out.println(m.to + "����" + m.command + "�� �����߽��ϴ�.");
				break;
			
			}
		}

	}

}
