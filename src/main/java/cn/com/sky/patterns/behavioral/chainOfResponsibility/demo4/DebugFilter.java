package cn.com.sky.patterns.behavioral.chainOfResponsibility.demo4;

public class DebugFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }

}
