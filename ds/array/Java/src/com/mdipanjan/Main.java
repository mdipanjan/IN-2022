package com.mdipanjan;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//	    int [] numbers = new int[3];
//        System.out.println(Arrays.toString(numbers));
//        int[] numbers = {10,20,30};
//        System.out.println(Arrays.toString(numbers));

//        Array Implementation
        Array customArray = new Array(5);
        customArray.insert(5);
        customArray.insert(6);
        customArray.insert(7);
        customArray.insert(8);
        customArray.insert(9);
        customArray.insert(10);
        customArray.removeAt(5);
        System.out.println(customArray.indexOf(9));
//        customArray.print();
    }
}
