package chapter12.string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {

		Date now = new Date();
		System.out.println(now);// ��ü���

		String strNow1 = now.toString();// ��ü -> String�� Ÿ��
		System.out.println("--------DATE--------");
		System.out.println(strNow1);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2 = sdf.format(now); // ��ü�� ���� ���ڿ��� ��ȯ
		System.out.println("--------SimpleDateFormat--------");
		System.out.println(strNow2);

		String strNow3 = sdf.toString(); // ��ü�� �ּҸ� String���� ��ȯ
		System.out.println("--------NoFormat--------");
		System.out.println(strNow3);
	}

}
