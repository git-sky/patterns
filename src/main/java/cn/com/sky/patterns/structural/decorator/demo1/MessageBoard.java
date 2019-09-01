package cn.com.sky.patterns.structural.decorator.demo1;

/**
 * 用户留言板的具体实现
 */
public class MessageBoard implements MessageBoardHandler {

    @Override
    public String filter(String msg) {
        return "处理留言板上的内容：" + msg;
    }

}