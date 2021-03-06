package cn.com.sky.patterns.behavioral.iterator.model;

import java.util.List;

public class ConcreteIterator implements Iterator {

	private List<Object> list;
	private int cursor = 0;// 当前游标位置

	public ConcreteIterator(List<Object> list) {
		this.list = list;
	}

	public boolean hasNext() {
		return !(cursor == list.size());
	}

	public Object next() {
		Object obj = null;
		if (hasNext()) {
			obj = list.get(cursor++);
		}
		return obj;
	}
}