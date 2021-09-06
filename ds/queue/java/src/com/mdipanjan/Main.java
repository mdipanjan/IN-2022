package com.mdipanjan;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Queue<Integer> queue =  new ArrayDeque<>();
       queue.add(10);
        queue.add(20);
        queue.add(30);
        reverser(queue);
    }
    // Reverse a QUEUE
    public static void reverser(Queue<Integer> queue){
        Stack<Integer> store = new Stack<>();

        queue.forEach(item->{
            int l = queue.remove();
            store.push(l);
        });
        while(!store.isEmpty()){
            int k = store.pop();
            System.out.println(k);
        }


    }
}
