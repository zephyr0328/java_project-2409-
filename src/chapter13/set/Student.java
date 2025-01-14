package chapter13.set;

public class Student implements Comparable<Student> {

	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student other) {
		// 점수를 기준으로 오름차순
		return Integer.compare(this.score, other.score);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " : " + score;
	}
	

}
