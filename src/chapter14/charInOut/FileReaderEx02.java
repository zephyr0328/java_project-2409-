package chapter14.charInOut;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderEx02 {

	public static void main(String[] args) {

		String filePath = "example.txt";
		// FileReaer�� �а� BufferedReader�� ���α�
		try (FileReader fr = new FileReader(filePath); BufferedReader br = new BufferedReader(fr)) {
			String line;
			while ((line = br.readLine()) != null) { // ���Ͽ��� �� �پ� �б�
				System.out.println(line); // ���� �� ���
			}
		} catch (Exception e) {
			System.err.println("���� �б� �� ���� �߻�: " + e.getMessage());
		}
		
	}

}
