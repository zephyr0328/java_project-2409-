package chapter14.standard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterEx03 {

	public static void main(String[] args) {

		String filePath = "buffered_output.txt";
		String[] data = { "Hello, world!", "This is a test.", "Java I/O is interesting!" };

		// BufferedWriter를 사용하여 파일에 줄 단위로 데이터 쓰기
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			for (String io : data) {
				writer.write(io);
				writer.newLine();// 줄바꿈
			}
			System.out.println("파일에 데이터가 성공적으로 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			System.out.println("파일 내용 : ");
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
