package chapter14.byteinout;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileoutputStreamEx01 {

	public static void main(String[] args) {
		// ���� ��� ����
		String filePath = "outputstream.txt";
		String data = "Hello, this is a test of FileOutputStream.";

		// FileOutputStream�� ����Ͽ� ���Ͽ� ������ ����
		try (FileOutputStream fos = new FileOutputStream(filePath)) {
			// ���ڿ� �����͸� ����Ʈ �迭�� ��ȯ�Ͽ� ���Ͽ� ����
			fos.write(data.getBytes());
			System.out.println("���Ͽ� �����Ͱ� ���������� ����Ǿ����ϴ�.");
			System.out.println("������ ���Ͽ� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("������ ���� ���� ���� �߻�: " + e.getMessage());
		}

	}

}
