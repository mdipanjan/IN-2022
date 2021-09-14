package com.mdipanjan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int ans = fibonacci( 4);
        System.out.println(ans);
    }
    public static int fibonacci(int n){
        if(n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
