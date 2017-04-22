package cn.com.sky.patterns.structural.bridge.demo;

public class ShapeCircle extends Shape {

	public void doColor() {
		System.out.println("shape circle ...");
		color.daub();
	}

}