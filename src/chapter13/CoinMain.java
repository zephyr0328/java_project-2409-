package chapter13;

import java.util.ArrayDeque;
import java.util.Deque;

public class CoinMain {

	public static void main(String[] args) {

		// ArrayDeque ��ü ���� ( ����ó�� ��� )
		Deque<Coin> coinStack = new ArrayDeque<Coin>();

		// �����߰�
		coinStack.push(new Coin(500));
		coinStack.push(new Coin(100));
		coinStack.push(new Coin(50));
		coinStack.push(new Coin(10));

		// ������ ��� ���� ������ Ȯ���ϰ� ���
		System.out.println("������ ��� ���� ������?" + !coinStack.isEmpty());
		
		//������ ��� ���� ������ ���� �ϳ��� ������(pop)
		while(!coinStack.isEmpty()) {
			Coin coin = coinStack.pop();
			System.out.println("������ ���� : "+coin.getValue());
			
		}
		

	}

}
