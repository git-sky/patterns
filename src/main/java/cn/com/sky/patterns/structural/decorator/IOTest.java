package cn.com.sky.patterns.structural.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class IOTest {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("f:/a.txt");

			new DataInputStream(is);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
