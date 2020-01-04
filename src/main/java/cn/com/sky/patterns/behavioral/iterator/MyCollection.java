package cn.com.sky.patterns.behavioral.iterator;

public class MyCollection implements Collection {

    public String arr[] = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return arr[i];
    }

    @Override
    public int size() {
        return arr.length;
    }
}