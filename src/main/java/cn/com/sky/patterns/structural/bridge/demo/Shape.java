package cn.com.sky.patterns.structural.bridge.demo;

/**
 * 形状维度
 */
public abstract class Shape {

	Color color;

	public void setColer(Color color) {
		this.color = color;
	}

	public abstract void doColor();

}