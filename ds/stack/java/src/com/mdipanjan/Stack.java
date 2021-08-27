package com.mdipanjan;

import java.util.Arrays;

public class Stack {
    public int [] items = new int[5];
    public int count;

    public void push(int item){
        if( count == items.length)
            throw new StackOverflowError();
        items[count] = item;
        count++;
    }

    public int pop() {
        if(count == 0)
            throw new IllegalStateException();
        count--;
        return items[count];
    }

    @Override
    public String toString(){
        int [] content  = Arrays.copyOfRange(items, 0, count);
        return  Arrays.toString(content);
    }
}
