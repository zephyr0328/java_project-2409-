package chapter14.byteinout;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx02 {

	public static void main(String[] args) {
		// ���� ��� ����
		String filePath = "outputstream.txt";

		try (FileInputStream fis = new FileInputStream(filePath)) {
			int byteData;
			System.out.println("���� ���� : ");

			// ���Ͽ��� �����͸� �ѹ���Ʈ�� �б�
			while ((byteData = fis.read()) != -1) {
				System.out.print((char) byteData);
			}
		} catch (Exception e) {
			System.out.println("������ ���� ���� ���� �߻�: " + e.getMessage());
		}

	}

}
