package chapter14.dataIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx03 {

	public static void main(String[] args) {
		String filePath = "buffered_output.dat"; // 데이터 파일 경로

        // BufferedOutputStream을 사용하여 데이터 쓰기
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            bos.write("Buffered Output Example".getBytes());// .getBytes() : 바이너리 파일로 형변환
            bos.flush(); // 버퍼의 내용을 강제로 출력
        } catch (IOException e) {
            e.printStackTrace();
        }       
        System.out.println("파일에 데이터가 성공적으로 저장되었습니다.");

	}

}
