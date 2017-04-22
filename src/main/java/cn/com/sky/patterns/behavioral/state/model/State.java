package cn.com.sky.patterns.behavioral.state.model;

//　　抽象状态类
public interface State {
	/**
	 * 状态对应的处理
	 */
	public void handle(String sampleParameter);
}