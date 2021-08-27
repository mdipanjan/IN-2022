package com.mdipanjan;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.pop();
//        System.out.println(stack);
        Stack stack = new Stack();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.pop();
        System.out.println(stack);
    }
}
