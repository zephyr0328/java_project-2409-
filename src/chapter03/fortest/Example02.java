package chapter03.fortest;

public class Example02 {

	public static void main(String[] args) {
		// Ȧ�� �������� ���弼��
		int i;
		int j;
		for(i=1;i<=9;i+=2)
		{
			System.out.println(i+"��");
			for(j=1;j<=9;j++)
			{
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}

	}

}
