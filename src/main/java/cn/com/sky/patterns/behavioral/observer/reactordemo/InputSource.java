package cn.com.sky.patterns.behavioral.observer.reactordemo;

/**
 * 外部输入类，用来表示需要reactor去处理的原始对象。
 */
public class InputSource {

    private Object data;
    private long id;

    public InputSource(Object data, long id) {
        this.data = data;
        this.id = id;
    }

    @Override
    public String toString() {
        return "InputSource{" +
                "data=" + data +
                ", id=" + id +
                '}';
    }
}