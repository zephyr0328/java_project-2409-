package chapter14.byteinout;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.StringBufferInputStream;

public class FileCopyEx04 {

	public static void main(String[] args) {

		// 원본 및 복사 파일 경로 설정
		String sourceFile = "IOStream.txt";
		String destFile = "copy.txt";

		// BufferedInputStream과 BufferedOutputStream을 사용하여 파일 복사
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {

			byte[] buffer = new byte[1024]; // 1KB 버퍼
			int byteRead;

			while ((byteRead = bis.read(buffer)) != -1) {
				// 1024B씩 0부터 시작해서 내용 쓰기
				bos.write(buffer, 0, byteRead);
			}
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다." + e.getMessage());
		}
	}

}
