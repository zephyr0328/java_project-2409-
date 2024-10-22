package chapter13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMessageMain {

	public static void main(String[] args) {

		Queue<Message> message = new LinkedList<Message>();

		// offer 입력
		message.offer(new Message("sendmail", "최백설"));
		message.offer(new Message("sendSMS", "김아리"));
		message.offer(new Message("sendkakaotalk", "박수석"));
		// poll 출력
		while (!message.isEmpty()) {
			Message m = message.poll();

			switch (m.command) {
			case "sendkakaotalk":
				System.out.println(m.to + "님의" + m.command + "이 도착했습니다.");
				break;
			case "sendmail":
				System.out.println(m.to + "님의" + m.command + "이 도착했습니다.");
				break;
			case "sendSMS":
				System.out.println(m.to + "님의" + m.command + "이 도착했습니다.");
				break;
			
			}
		}

	}

}
