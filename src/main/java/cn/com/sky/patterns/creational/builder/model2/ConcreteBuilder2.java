package cn.com.sky.patterns.creational.builder.model2;

public class ConcreteBuilder2 implements Builder {

	private Product2 product = new Product2();

	/**
	 * 产品零件建造方法1
	 */
	@Override
	public void buildPart1() {
		// 构建产品的第一个零件
		product.setPart1("编号：9528");
	}

	/**
	 * 产品零件建造方法2
	 */
	@Override
	public void buildPart2() {
		// 构建产品的第二个零件
		product.setPart2("名称：老王");
	}

	/**
	 * 产品返还方法
	 */
	@Override
	public Product retrieveResult() {
		return product;
	}

}