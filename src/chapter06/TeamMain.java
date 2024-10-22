package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		TeamGroup team = new TeamGroup();
		team.init();// 팀원 정보 입력
		team.Disp();// 출력

		TeamMember t = new TeamMember();
		t.setName("유희민");
		System.out.println("팀장이름: " + t.getName());
		t.setmPhone("010-0000-0000");
		System.out.println("팀장전화번호: " + t.getmPhone());
		t.setsName("이은정");
		System.out.println("부팀장이름: " + t.getsName());
		t.setmPhone("010-1111-1111");
		System.out.println("부팀장 전화번호: " + t.getmPhone());
		t.setName("강자성");
		System.out.println("이름: " + t.getName());
		t.setmPhone("010-2222-2222");
		System.out.println("팀원 전화번호: " + t.getmPhone());
		

	}

}
