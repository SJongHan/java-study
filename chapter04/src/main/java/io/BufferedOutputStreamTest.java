package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;

		try {
			// 기반스트림
			FileOutputStream fos = new FileOutputStream("test.txt");

			// 보조스트림
			bos = new BufferedOutputStream(fos);

			// for(char c = 'a'; c <= 'z'; c++) {
			for (int i = 97; i <= 122; i++) {
				bos.write(i);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Can Not Open:" + e);
		} catch (IOException e) {
			System.out.println("Error:" + e);
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
