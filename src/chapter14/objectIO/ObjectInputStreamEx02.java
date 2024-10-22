package chapter14.objectIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx02 {

	public static void main(String[] args) {
		String filePath = "person.dat"; // ������ ���� ���

		// ObjectInputStream�� ����Ͽ� ��ü �б�
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
			Person person = (Person) ois.readObject(); // ���Ͽ��� ��ü ����(������ȭ)
			System.out.println("���� ��ü: " + person);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
