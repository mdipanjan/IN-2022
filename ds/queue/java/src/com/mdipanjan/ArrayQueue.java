package com.mdipanjan;

import java.util.Arrays;

public class ArrayQueue {
    int items [];
    int rear;
    int front;
    int count;

    public  ArrayQueue(int capacity) {
        items = new int[capacity];
    }
    //[ 1 2 3 4 0 0 0 ]
    public void enqueue(int item) {
        if(count == items.length)
            throw new IllegalStateException();
        items[rear] = item;
        rear = (rear + 1)%items.length;
        count++;
    }
    public int dequeue() {
        int item = items[front];
        items[front] = 0;
        front = (front + 1)%items.length;
        count--;
        return item;
    }
    @Override
    public String toString(){
       return Arrays.toString(items);
    }
}
