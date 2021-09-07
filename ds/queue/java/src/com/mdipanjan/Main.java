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
//        System.out.println(reverser(queue));
        ArrayQueue queue1 = new ArrayQueue(5);
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        queue1.dequeue();
        queue1.dequeue();
        queue1.enqueue(40);
        queue1.enqueue(50);
        queue1.enqueue(60);
        queue1.enqueue(70);
        System.out.println(queue1);

    }
    // Reverse a QUEUE
    public static Queue<Integer> reverser(Queue<Integer> queue){
        Stack<Integer> store = new Stack<>();
        while (!queue.isEmpty()){
            int l = queue.remove();
            store.push(l);
        }
        while(!store.isEmpty()){
            int k = store.pop();
            queue.add(k);
        }
        return queue;

    }
}
