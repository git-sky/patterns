package cn.com.sky.patterns.structural.decorator.demo1;

/**
 * 装饰角色
 */
public class MessageBoardDecorator implements MessageBoardHandler {

    private MessageBoardHandler handler;

    public MessageBoardDecorator(MessageBoardHandler handler) {
        this.handler = handler;
    }

    @Override
    public String filter(String msg) {
        return handler.filter(msg);
    }

}