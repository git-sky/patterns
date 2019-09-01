package cn.com.sky.patterns.creational.singleton;

import cn.com.sky.patterns.creational.singleton.model2.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * EnumSingleton可以防止序列化，防止反射。
 */
public class TestEnumSingleton {

	public static void main(String[] args) {

		try {
			Class<EnumSingleton> classType = EnumSingleton.class;
			Constructor<EnumSingleton> c = (Constructor<EnumSingleton>) classType.getDeclaredConstructor();
			c.setAccessible(true);
			c.newInstance();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		
		EnumSingleton singleton = EnumSingleton.INSTANCE;
		System.out.println(singleton);

		try {
			FileOutputStream fos = new FileOutputStream("temp.out");

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(singleton);
			oos.flush();
			oos.close();

			FileInputStream fis = new FileInputStream("temp.out");
			ObjectInputStream ois = new ObjectInputStream(fis);
			EnumSingleton singleton2 = (EnumSingleton) ois.readObject();// 从文件中还原类的对象,不会调用构造函数
			ois.close();

			System.out.println(singleton2);

			FileInputStream fis2 = new FileInputStream("temp.out");
			ObjectInputStream ois2 = new ObjectInputStream(fis2);
			EnumSingleton singleton3 = (EnumSingleton) ois2.readObject();// 从文件中还原类的对象,不会调用构造函数
			ois2.close();
			System.out.println(singleton3);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}