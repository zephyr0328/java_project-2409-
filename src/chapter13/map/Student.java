package chapter13.map;

public class Student {

	public int sno;
	public String name;

	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student[sno : " + sno + " , " + "name : "+name + "]";
	}

}
