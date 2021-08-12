package com.mdipanjan;

public class Array {
    private int[] items;
    private int count;
    public Array(int length){
        items = new int[length];
    }
    public void print(){
        for (int i = 0; i < count ; i++) {
            System.out.println(items[i]);
        }
    }
    public void insert(int item){
        //If the array id full, need to resize
        if(items.length == count){
            //Created New Array Twice the size of older one
            int [] newItems = new int[count*2];
            // Copy Old array Items into new Array
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            // Assign New array to Old Array
            items = newItems;
        }
        // If Array is not full, Insert elements
        items[count] = item;
        count++;
    }
    public void removeAt(int index){
        if(index < 0 || index >= count) try {
            throw new IllegalAccessException();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        for (int i = index; i < count; i++) {
            items[i] = items[i+1];
        }
        count--;
    }
    public int indexOf(int item){
        for (int i = 0; i < count ; i++) {
            if(items[i] == item) return i;
        }
        return -1;
    }
}
