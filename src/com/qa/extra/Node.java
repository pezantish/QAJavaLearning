package com.qa.extra;

public class Node {
	static int maxDepth;
	int depth;
	String ID;
	Node left, right, parent;

	//CONSTRUCTOR
	public Node(String ID, int level, Node parent) {
		//ID isn't necessarily unique. Could assign string instead, and add a map i.e. LLRL
		this.ID = ID;
		this.depth = level;
		this.parent = parent;
		if (level > maxDepth) {
			maxDepth = level;
		}
	}
	
	//OVERLOAD
	public Node() {}

	//NODE CREATION
	//Creates a node within itself, assign to left or right respectively.
	public Node createLeft() {
		this.left = new Node(ID+"L", depth+1, this);
		return left;
	}
	public Node createRight() {
		this.right = new Node(ID+"R", depth+1, this);
		return right;
	}
	
	//CHECKS IF A NODE IS PERFECT
	public boolean perfectNode() {
		//if it has no children, but isn't level, return false
		if((left == null) && right == null) {
			if(depth != maxDepth) { 
				return false;
			}
		//if a node has only one child, return false
		}else if (left == null || right == null) {
			return false;
		}
		return true;
	}

}
