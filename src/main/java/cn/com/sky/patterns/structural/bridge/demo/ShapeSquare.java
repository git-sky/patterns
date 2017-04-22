package cn.com.sky.patterns.structural.bridge.demo;

public class ShapeSquare extends Shape {

	public void doColor() {
		System.out.println("shape square ...");
		color.daub();
	}

}