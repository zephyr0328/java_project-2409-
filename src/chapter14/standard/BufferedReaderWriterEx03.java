package chapter14.standard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterEx03 {

	public static void main(String[] args) {

		String filePath = "buffered_output.txt";
		String[] data = { "Hello, world!", "This is a test.", "Java I/O is interesting!" };

		// BufferedWriter�� ����Ͽ� ���Ͽ� �� ������ ������ ����
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			for (String io : data) {
				writer.write(io);
				writer.newLine();// �ٹٲ�
			}
			System.out.println("���Ͽ� �����Ͱ� ���������� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			System.out.println("���� ���� : ");
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
