package cn.com.sky.patterns.structural.decorator.demo1;

/**
 * 用户留言板处理的接口
 */
public interface MessageBoardHandler {

	public String filter(String msg);

}