package chapter14.byteinout;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.StringBufferInputStream;

public class FileCopyEx04 {

	public static void main(String[] args) {

		// ���� �� ���� ���� ��� ����
		String sourceFile = "IOStream.txt";
		String destFile = "copy.txt";

		// BufferedInputStream�� BufferedOutputStream�� ����Ͽ� ���� ����
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {

			byte[] buffer = new byte[1024]; // 1KB ����
			int byteRead;

			while ((byteRead = bis.read(buffer)) != -1) {
				// 1024B�� 0���� �����ؼ� ���� ����
				bos.write(buffer, 0, byteRead);
			}
		} catch (Exception e) {
			System.out.println("������ �߻��߽��ϴ�." + e.getMessage());
		}
	}

}
