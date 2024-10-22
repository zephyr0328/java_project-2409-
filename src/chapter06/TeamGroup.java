package chapter06;

public class TeamGroup {
	// 멤버변수
	private TeamMember member[] = new TeamMember[5];

	// 기본 생성자

	// 초기화 메서드
	public void init() {
		// member[0]=new TeamMember(); 기본생성자
		member[0] = new TeamMember("강자성", "남학생"); // 오버로딩 생성자
		member[1] = new TeamMember("강서연", "여학생"); // 오버로딩 생성자
		member[2] = new TeamMember("이은정", "여학생"); // 오버로딩 생성자
		member[3] = new TeamMember("유희민", "남학생"); // 오버로딩 생성자
		member[4] = new TeamMember("김원기", "남학생"); // 오버로딩 생성자
	}

	// 출력 메서드
	public void Disp() {
		for (int i = 0; i < member.length; i++) {
			System.out.print("성명 : "+member[i].getName());
			System.out.println(", 성별 : "+member[i].getGender());
		}
	}

}
