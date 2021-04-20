package cn.com.sky.patterns.behavioral.chainOfResponsibility.demo2;

import java.util.ArrayList;
import java.util.List;

public class BroadbandFilter implements Filter {
	@Override
	public List<Consumer> filtrate(List<Consumer> consumers) {
		List<Consumer> cs = new ArrayList<>();
		// 手机套餐为138以上 赠送移动宽带100M一年
		for (Consumer c : consumers) {
			if (c.getCombos() >= 138) {
				cs.add(c);
			}
		}
		return cs;
	}
}