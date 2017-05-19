package cn.com.sky.patterns.structural.proxy;

public class DBQuery implements IDBQuery {

	public DBQuery() {
		try {
			Thread.sleep(10000);
			System.out.println("DBQuery is create");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String request() {
		return "request string";
	}

}
