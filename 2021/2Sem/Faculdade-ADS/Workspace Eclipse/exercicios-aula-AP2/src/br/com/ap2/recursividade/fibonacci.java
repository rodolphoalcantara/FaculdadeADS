package br.com.ap2.recursividade;

public class fibonacci {
	
	public static void main(String[] args) {
		
		System.out.println("fib 8: "+ fib(8));
		
	}
	
	
	public static int fib(int n){
		
		if(n < 2) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}

}
