package cn.com.sky.patterns.structural.proxy.staticproxy.demo2;

public class HelloServiceImpl implements HelloService {

	public String say(String str) {
		System.out.println("say:" + str);
		return "say:" + str;
	}

}