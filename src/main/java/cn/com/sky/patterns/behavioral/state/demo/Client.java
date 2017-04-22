package cn.com.sky.patterns.behavioral.state.demo;

/**
 * 从示例可以看出，状态的转换基本上都是内部行为，主要在状态模式内部来维护。比如对于投票的人员，任何时候他的操作都是投票，但是投票管理对象的处理却不一定一样，会根据投票的次数来判断状态，
 * 然后根据状态去选择不同的处理。
 */
public class Client {

	public static void main(String[] args) {

		VoteManager vm = new VoteManager();
		for (int i = 0; i < 9; i++) {
			vm.vote("u1", "A");
		}
	}

}