package cn.com.sky.patterns.behavioral.visitor.static_dispatch;

/**
 * <pre>
 * 
 * 变量被声明时的类型叫做变量的静态类型(Static Type)，有些人又把静态类型叫做明显类型(Apparent Type)；
 * 而变量所引用的对象的真实类型又叫做变量的实际类型(Actual Type)。比如：
 * 
 * List list = null;
 * list = new ArrayList();
 * 声明了一个变量list，它的静态类型（也叫明显类型）是List，而它的实际类型是ArrayList。
 * 
 * 根据对象的类型而对方法进行的选择，就是分派(Dispatch)，分派(Dispatch)又分为两种，即静态分派和动态分派。
 * 
 * 
 * 静态分派(Static Dispatch)发生在编译时期，分派根据静态类型信息发生。静态分派对于我们来说并不陌生，方法重载就是静态分派。
 * 
 * 动态分派(Dynamic Dispatch)发生在运行时期，动态分派动态地置换掉某个方法。
 * 
 * 静态分派
 * Java通过方法重载支持静态分派。
 * 
 * 重载方法的分派是根据静态类型进行的，这个分派过程在编译时期就完成了。
 * 
 * 程序会打印出相同的两行“骑马
 */
public class Mozi {

	public void ride(Horse h) {
		System.out.println("骑马");
	}

	public void ride(WhiteHorse wh) {
		System.out.println("骑白马");
	}

	public void ride(BlackHorse bh) {
		System.out.println("骑黑马");
	}

	public static void main(String[] args) {
		Horse wh = new WhiteHorse();
		Horse bh = new BlackHorse();
		Mozi mozi = new Mozi();
		mozi.ride(wh);
		mozi.ride(bh);
	}

}