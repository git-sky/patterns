package cn.com.sky.patterns.structural.composite;

import java.util.Enumeration;
import java.util.Vector;

public class TreeDemo {

	TreeNode root = null;

	public TreeDemo(String name) {
		root = new TreeNode(name);
	}

	public static void main(String[] args) {
		TreeDemo tree = new TreeDemo("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");

		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished!");
	}
}

class TreeNode {

	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();

	public TreeNode(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	// 添加孩子节点
	public void add(TreeNode node) {
		children.add(node);
	}

	// 删除孩子节点
	public void remove(TreeNode node) {
		children.remove(node);
	}

	// 取得孩子节点
	public Enumeration<TreeNode> getChildren() {
		return children.elements();
	}
}