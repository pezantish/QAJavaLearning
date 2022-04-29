package com.qa.extra;

public class ExtraTasks {
	private static int answer = 1;

	public static void main(String[] args) {
		//System.out.println(prime(4));
		//System.out.println("This many small bags are needed: "+ riceBags(14, 3, 19));
		//System.out.println(factorial(5));
		//System.out.println(commonDivisor(52, 20));
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

	public static boolean binaryTree() {
		return true;
	}
}
