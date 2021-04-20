package cn.com.sky.patterns.behavioral.observer.pull;

/**
 * <pre>
 *
 * 观察者类
 *
 * 拉模型的抽象观察者类
 * 拉模型通常都是把主题对象当做参数传递。
 *
 * </pre>
 */
public interface Observer {
    /**
     * 更新接口
     *
     * @param subject 传入主题对象，方面获取相应的主题对象的状态
     */
    void update(Subject subject);
}