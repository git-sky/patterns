package cn.com.sky.patterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * <pre>
 * 
 * 通过反序列化创建对象
 * 
 * 在反序列化时，jvm创建对象并不会调用任何构造函数。
 * 
 * SerialSingleton通过实现readResolve方法，反序列化的时候，保证获得的是同一个对象。
 * 
 * </pre>
 */
public class TestSerialSingleton {

	public static void main(String args[]) throws IOException, ClassNotFoundException {

		SerialSingleton singleton = SerialSingleton.getInstance();
		System.out.println(singleton);

		FileOutputStream fos = new FileOutputStream("temp.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(singleton);
		oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream("temp.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerialSingleton singleton2 = (SerialSingleton) ois.readObject();// 从文件中还原类的对象,不会调用构造函数
		ois.close();

		System.out.println(singleton2);

		FileInputStream fis2 = new FileInputStream("temp.out");
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		SerialSingleton singleton3 = (SerialSingleton) ois2.readObject();// 从文件中还原类的对象,不会调用构造函数
		ois2.close();
		System.out.println(singleton3);

	}
}
