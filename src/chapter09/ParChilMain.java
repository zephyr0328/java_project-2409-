package chapter09;

public class ParChilMain {

	public static void main(String[] args) {

		ChildEx c1 = new ChildEx();

		System.out.println(c1.getCar());// �ڽ�
		System.out.println(c1.getMoney());// �θ�

		// -------------------------------------------

		if (c1 instanceof ParentEx) {
			System.out.println("c1�� ParentEx�� �ڽ� Ŭ�����Դϴ�.");
		}
		// -----------------------------------------------

		ChildEx ch = new ChildEx();
		ParentEx p1 = new ParentEx();
		System.out.println("----------------------------");
		p1 = ch;// �ڵ�����ȯ
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());

		System.out.println("----------------------------");
		ch = (ChildEx) p1;// ����� ����ȯ
		System.out.println(ch.getCar());
		System.out.println(ch.getMoney());
		System.out.println(ch.getStr());
	}

}
