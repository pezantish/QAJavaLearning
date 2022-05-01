package com.qa.extra;

public class ExtraTasks {
	private static int answer = 1;

	public static void main(String[] args) {
		//System.out.println(prime(4));
		//System.out.println("This many small bags are needed: "+ riceBags(14, 3, 19));
		//System.out.println(factorial(5));
		//System.out.println(commonDivisor(52, 20));
		//binaryTree();
		//bottlesOfBeer();
	}
	
	public static int riceBags(int smalls, int bigs, int target) {
		int usedSmalls = 0;
		while((target>=5)&&(bigs>0)) {
			target -= 5;
			bigs--;
		}
		while ((target>=1)&& (smalls>0)) {
			target -= 1;
			smalls--;
			usedSmalls++;
		}
		if(target == 0) {
			return usedSmalls;
		}else {
			return -1;
		}
	}	

	public static void bottlesOfBeer() {
		for(int j = 0; j<10;j++) {
			for (int i = 99; i >= 0; i--) {
				if(i==0) {
					System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
					System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
					System.out.println();
				}else if(i==1){
					System.out.println("Only " + i+ " bottle of beer on the wall, only " + i + " bottle of beer.");
					System.out.println("Take it down and pass it around, no more bottles of beer on the wall.");
					System.out.println();
				}else {
					System.out.println(i+ " bottles of beer on the wall, " + i + " bottles of beer.");
					System.out.println("Take one down and pass it around, " + (i-1) + " bottles of beer on the wall.");
					System.out.println();
				}
			}
		}
	}

	public static int prime(int num) {
		int biggest = -1;
		for(int i = 2; i < num; i++) {
			if(num%i == 0) {
				boolean prime = true;
				for(int j = 2; j < i; j++) {
					if(i%j == 0) {
						prime = false;
					}			
				}
				if(prime){
					if(i>biggest) {
						biggest = i;
		}}}}
		return biggest;
	}

	public static int factorial(int num) {
		if(num != 1) {
			answer = num * factorial(num-1);
		}
		return answer;
	}

	public static int commonDivisor(int num, int num2) {
		for(int i= Math.min(num, num2); i>0; i--) {
			if((num%i == 0) && (num2%i == 0)){
				return i;
			}
		}
		return -1;
	}

	public static void binaryTree() {
		String startKey = "*";
		int startDepth = 0;
		Node root = new Node(startKey, startDepth, null);
		Tree tree = new Tree(root);
		
		//PERFECT TREE WITH MAX DEPTH ROOT+2
		tree.makeAndMoveLeft();
		tree.makeLeft();
		tree.makeRight();
		tree.moveUp();
		tree.makeAndMoveRight();
		tree.makeLeft();
		tree.makeRight();
		//RETURN TO ROOT
		tree.moveUp();
		
		//MOVE TO LEFT MOST NODE, MAX DEPTH
		tree.moveLeft();
		tree.moveLeft();
		
		//IMPERFECT TREE  WITH MAX DEPTH ROOT + 4
		for(int i = 0; i < 2;i++) {
			tree.makeRight();
			tree.makeAndMoveLeft();
			
		}
		tree.mapTree();
		//CHECKS PERFECTION
		tree.checkPerfection();
		
	}
}
