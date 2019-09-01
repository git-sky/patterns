package cn.com.sky.patterns.structural.decorator.model;

/**
 * <pre>
 *
 * 具体构件角色
 *
 * 原始被装饰的具体类
 *
 * </pre>
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("ConcreteComponent... ");
    }

}
