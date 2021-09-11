package com.mdipanjan;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] arr = {1,3,2,4};
        // expected -> 3 4 4 -1
//        int [] arr = {5,7,3,2,1,4,7,9};
        // expected ->7 9 4 4 4 7 9, -1
        ArrayList<Integer> result = nextGreaterToRight(arr, 4);
        Collections.reverse(result);
        System.out.println(result);
    }
    public static ArrayList<Integer> nextGreaterToRight(int [] arr, int size){
        ArrayList<Integer> vector = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = size -1 ; i >= 0; i-- ){

            if(stack.size() == 0){
                vector.add(-1);
            }else if(stack.size() > 0 && stack.lastElement() > arr[i]){
                vector.add(stack.lastElement());
            }
            else if(stack.size() > 0 && stack.lastElement() <= arr[i]){
                while (stack.size() > 0 && stack.lastElement() <= arr[i]){
                    stack.pop();
                }
                if(stack.size() == 0){
                    vector.add(-1);
                }else {
                    vector.add(stack.lastElement());
                }
            }
            stack.push(arr[i]);
//            System.out.println(stack);
        }

        return vector;
    }
}
