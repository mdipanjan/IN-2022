package com.mdipanjan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tree bst = new Tree();
        bst.insert(20);
        bst.insert(10);
        bst.insert(12);
        bst.insert(15);
        bst.insert(9);
        System.out.println(bst.find(92));

    }
}
