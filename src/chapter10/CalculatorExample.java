package chapter10;

public class CalculatorExample {
	
	public int getResult(int n1, int n2){
		return -1;
	}
}
/*
CalculatorŬ������ ����� //getResult()�Լ��� �����ϼ���. ��ȯ���� ����. //���� �ΰ�(n1, n2)�� �ް� -1��
�����ϰ� ����ϴ�.

CalPlusŬ������ ����� CalculatorŬ������ ��ӹ�������. //�������̵��� �̿��Ͽ� Calculator��
getResult()�Լ��� //���ڷ� ���� n1�� n2�� �����ִ� �Լ��� ����ϴ�. //���� ���ϰ��� -1�̸� �ȵǰ���??

CalMinusŬ������ ����� CalculatorŬ������ ��ӹ�������. //�������̵��� �̿��Ͽ� Calculator��
getResult()�Լ��� //���ڷ� ���� n1�� n2�� ���ִ� �Լ��� ����ϴ�.

Main���� �����Ͽ� �Ʒ��� ���� ����� ������ ���� //CalPlus : 30 //CalMinus : 15
*/