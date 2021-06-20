package cn.com.sky.patterns.behavioral.chainOfResponsibility.demo4;

/**
 *
 */
public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }

}