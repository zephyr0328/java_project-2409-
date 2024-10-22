package chapter14.charInOut;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CSVReadEx03 {

	public static void main(String[] args) {
		// CSV ���� ��� ����
		String csvFile = "data.csv";

		// BufferedReader�� ����Ͽ� CSV ���Ͽ��� ������ �б�
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile), "EUC-KR"))) {
			String line;
			System.out.println("CSV ���� ����:");

			// ���Ͽ��� �����͸� �� �پ� �б�
			while ((line = br.readLine()) != null) {
				// CSV �����͸� ��ǥ�� �и��Ͽ� ���
				String[] values = line.split(",");
				for (String value : values) {
					System.out.print(value + "\t");
				}
				System.out.println(); // �ٹٲ�
			}
		} catch (IOException e) {
			System.err.println("CSV ������ �д� ���� ���� �߻�: " + e.getMessage());
		}

	}

}
