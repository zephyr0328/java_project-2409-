package chapter13;

import java.util.Stack;

public class StackEx09 {
	/*
	 * Stack�� Vector�� ��ӹ޾ұ� ������ ����ȭ�� �޼��带 �����Ѵ�. ��, ��Ƽ������ ȯ�濡���� ���� �����尡 ���ÿ� ���ÿ� ������ ��
	 * ������ ���Ἲ�� ������ �� �ִ�. ������ ���� ������ ȯ�濡�� ��� �� ���ʿ��� ���� ���ϰ� �߻��� �� �ִ�.
	 */

	public static void main(String[] args) {
		// Stack ��ü ����
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		// Stack�� �� �� ������ Ȯ��(peek)
		System.out.println("Stack�� �� �� ��� : " + stack.peek());

		// Stack���� ������ ���(pop)
		System.out.println("���� ������ : " + stack.pop());

		System.out.println("Stack�� ���� ��� : " + stack.peek());
		System.out.println("���� ������ : " + stack.pop());

		System.out.println("Stack�� ���� ��� : " + stack.peek());

		// Stack�� ����� �ִ��� Ȯ��
		System.out.println("Stack�� ��� �ֳ���?" + stack.isEmpty());// false

		System.out.println("���� ������ : " + stack.pop());
		System.out.println("Stack�� ��� �ֳ���?" + stack.isEmpty());// true
	}

}
