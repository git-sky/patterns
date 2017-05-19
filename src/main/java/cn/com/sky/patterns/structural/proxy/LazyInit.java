package cn.com.sky.patterns.structural.proxy;

/**
 * 代理模式实现延迟加载
 */
public class LazyInit {

	public static void main(String args[]) {
		IDBQuery q = new DBQueryProxy();
		System.out.println(q.request());
	}

}
