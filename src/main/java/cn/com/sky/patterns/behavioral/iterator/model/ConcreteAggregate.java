package cn.com.sky.patterns.behavioral.iterator.model;

import java.util.List;

public class ConcreteAggregate implements Aggregate {

	private List<Object> list;

	public ConcreteAggregate(List<Object> list) {
		this.list = list;
	}

	public void add(Object obj) {
		list.add(obj);
	}

	public void remove(Object obj) {
		list.remove(obj);
	}

	public Iterator iterator() {
		return new ConcreteIterator(list);
	}
}