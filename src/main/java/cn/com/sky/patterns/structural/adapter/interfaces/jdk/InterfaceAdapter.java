package cn.com.sky.patterns.structural.adapter.interfaces.jdk;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * jdk中的 接口适配器模式
 */
public class InterfaceAdapter extends MouseAdapter {
	@Override
	public void mousePressed(MouseEvent event) {
		super.mousePressed(event);
	}

}
