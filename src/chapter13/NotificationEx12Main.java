package chapter13;

import java.util.LinkedList;
import java.util.Queue;

public class NotificationEx12Main {

	public static void main(String[] args) {
		Queue<Notification> noti = new LinkedList<Notification>();
		

		noti.offer(new Notification("안녕", "Phone"));
		noti.offer(new Notification("그래", "Mail"));
		noti.offer(new Notification("어", "SNS"));

		while (!noti.isEmpty()) {
			Notification massage = noti.poll();
			System.out.println(massage.recipient + " 에게" + massage.action + "이 도착했습니다.");
			// switch문을 사용하는 이유는 속도가 빠르기 때문에
		}

	}

}
