package chapter14.byteinout;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOStreamEx03 {

	public static void main(String[] args) {
		String data = "Hello, this is a test of FileInputStream and FileOutputStream.";
		String filePath = "IOStream.txt";

		// ���Ͽ� ������ ����
		try (FileOutputStream fos = new FileOutputStream(filePath)) {
			fos.write(data.getBytes());
			System.out.println("���������� �����͸� �����߽��ϴ�.");
		} catch (Exception e) {
			System.out.println("������ �߻��߽��ϴ�." + e.getMessage());

		}

		System.out.println("==============================");

		// ���Ͽ��� ������ �б�
		try (FileInputStream fis = new FileInputStream(filePath)) {
			int byteData;
			System.out.println("���� ���� : ");

			while ((byteData = fis.read()) != -1) {
				System.out.print((char) byteData);
			}
		} catch (Exception e) {
			System.out.println("������ �߻��߽��ϴ�." + e.getMessage());
		}
	}

}
