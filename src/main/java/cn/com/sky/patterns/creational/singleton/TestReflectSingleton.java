package cn.com.sky.patterns.creational.singleton;

import cn.com.sky.patterns.creational.singleton.model2.ReflectSingleton;

import java.lang.reflect.Constructor;

/**
 * 反射会导致创建单例类的多个对象。
 */
public class TestReflectSingleton {

	public static void main(String args[]) {

		// ReflectSingleton ref = ReflectSingleton.getInstance();
		// System.out.println(ref);
		//
		// ReflectSingleton ref2 = ReflectSingleton.getInstance();
		// System.out.println(ref2);

		try {

			Class c = Class.forName(ReflectSingleton.class.getName());
			Constructor cons = c.getDeclaredConstructor();
			cons.setAccessible(true);

			ReflectSingleton single1 = (ReflectSingleton) cons.newInstance();
			System.out.println(single1);
			System.out.println("==============================");

			// Field flag = c.getDeclaredField("flag");
			// flag.setAccessible(true);
			// flag.setBoolean(c, false);

			ReflectSingleton single2 = (ReflectSingleton) cons.newInstance();
			System.out.println(single2);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
