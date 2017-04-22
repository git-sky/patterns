package cn.com.sky.patterns.behavioral.iterator;

public class Client {

	public static void main(String[] args) {
		
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}