package chapter13;

import java.util.List;
import java.util.Vector;

public class VectorBoardMain {

	public static void main(String[] args) {

		List<Board> list = new Vector<Board>();

		// �����߰�
		Board b = new Board("����1", "����1", "�۾���1");

		list.add(b); //
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}

		// ���� ����
		list.remove(2);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}

	}

}
