package cn.com.sky.patterns.structural.composite.transparent.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合类
 */
public class Composite extends Component {

    // 用来保存节点的子节点
    private List<Component> list = new ArrayList<>();

    // 添加节点 添加部件
    @Override
    public void add(Component c) {
        list.add(c);
    }

    // 删除节点 删除部件
    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    // 遍历子节点
    @Override
    public void eachChild() {
        System.out.println(name + "执行了");
        for (Component c : list) {
            c.eachChild();
        }
    }
}