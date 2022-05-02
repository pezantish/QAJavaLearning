package com.qa.extra;

import java.util.ArrayList;

//TO DO:
//WIEGHTED TREE WITH GREEDY SEARCH

public class Tree {
	Node root, current;
	ArrayList<Node> unseen = new ArrayList<>();
	ArrayList<Node> all = new ArrayList<>();
	
	//CONSTRUCTOR
	public Tree(Node root) {
		this.root = root;
		this.current = root;
		all.add(root);
	}
	
	//CREATES NODES AND ADDS TO "ALL"
	public void makeLeft() {
		if(current.left == null) {
			all.add(current.createLeft());
		}
	}
	public void makeRight() {
		if(current.right == null) {
			all.add(current.createRight());
		}
	}

	//CHANGES POINTER TO RESPECTIVE NODE
	public void moveLeft() {
		if(current.left != null) {
			current = current.left;
		}
	}
	public void moveRight() {
		if(current.right != null) {
			current = current.right;
		}
	}
	public void moveUp() {
		if(current.parent != null) {
			current = current.parent;
		}
	}

	//CREATES NODES, ADDS TO "ALL" AND MOVES POINTER
	public void makeAndMoveLeft() {
		current = current.createLeft();
		all.add(current);
		
	}
	public void makeAndMoveRight() {
		current = current.createRight();
		all.add(current);
	}

	//DOES A SINGLE ITERATION OF DEPTH FIRST
	public void depthFirstSearch() {
		
		if(unseen.contains(current.left)){
			moveLeft();
			unseen.remove(unseen.indexOf(current));
		}else if(unseen.contains(current.right)){
			moveRight();
			unseen.remove(unseen.indexOf(current));
		}else if(current.parent != null){ 
			System.out.println("UP");
			moveUp();
		}else {
			unseen.clear();
		}
		System.out.println("PATH:  " + current.ID);
		if(unseen.size() == 1) {
			System.out.println("===============");
			System.out.println("END OF TREE");
			System.out.println("===============");
		}
	}
	
	//USING DFS SEARCHES TREE FOR IMPERFECT END NODES
	public void checkPerfection() {
		current = root;
		System.out.println("----------------");
		System.out.println("CHECKING FOR PERFECTION");
		System.out.println("----------------");
		System.out.println("PATH:  " + current.ID);
		//default is perfect tree
		String output = "Perfect Tree!";
		//copies all to unseen, doesn't overwrite
		for(Node n: all) {
			unseen.add(n);
		}
		//checks for imperfect node across all nodes
		while(unseen.size() > 1) {
			if (!current.perfectNode()) {
				unseen.clear();
				output = "Imperfect Tree!";
			}else {
				depthFirstSearch();
			}
		}
		System.out.println("===============");
		System.out.println(output);
		System.out.println("===============");
	}
	
	//USING DFS, TRAVERSES ENTIRE TREE
	public void mapTree() {
		current = root;
		for(Node n: all) {
			unseen.add(n);
		}
		System.out.println("----------------");
		System.out.println("MAPPING");
		System.out.println("----------------");
		System.out.println("PATH:  " + current.ID);
		while(unseen.size() > 1) {
				depthFirstSearch();
		}
		System.out.println();
	}
}

