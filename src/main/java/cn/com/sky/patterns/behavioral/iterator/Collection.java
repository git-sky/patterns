package cn.com.sky.patterns.behavioral.iterator;

public interface Collection {

	/* 取得集合元素 */
	public Object get(int i);

	/* 取得集合大小 */
	public int size();

	public Iterator iterator();
}