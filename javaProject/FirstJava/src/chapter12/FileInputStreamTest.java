package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) throws IOException {
		
		try {
			FileInputStream fin = new FileInputStream("D:\\test\\test1.txt");

			int i = fin.read();

			System.out.println(i);
			System.out.println((char) i);

			fin.close();
			System.out.println("파일의 데이터를 읽어왔습니다.");

		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}
	}

}