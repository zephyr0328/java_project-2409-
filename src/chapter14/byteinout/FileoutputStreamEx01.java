package chapter14.byteinout;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileoutputStreamEx01 {

	public static void main(String[] args) {
		// 파일 경로 설정
		String filePath = "outputstream.txt";
		String data = "Hello, this is a test of FileOutputStream.";

		// FileOutputStream을 사용하여 파일에 데이터 쓰기
		try (FileOutputStream fos = new FileOutputStream(filePath)) {
			// 문자열 데이터를 바이트 배열로 변환하여 파일에 저장
			fos.write(data.getBytes());
			System.out.println("파일에 데이터가 성공적으로 저장되었습니다.");
			System.out.println("내용이 파일에 저장되었습니다.");
		} catch (Exception e) {
			System.out.println("파일을 쓰는 도중 오류 발생: " + e.getMessage());
		}

	}

}
