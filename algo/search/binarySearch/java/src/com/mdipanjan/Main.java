package com.mdipanjan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] ar = {1,2,4,7,8,9,12,22,29,33,34,37,56,65,69,75};
        int elem = binarySearch(ar, 120);
        System.out.println(elem);
    }
    //Binary search on sorted Integers
    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int middle = start + (end-start)/2;
            // Divide Array based on middle elem
            if(target > arr[middle]){
                start = middle+1;
            }else if(target < arr[middle]){
                end = middle - 1;
            }else{
                //Middle is our answer
                return middle;
            }
        };
        //If Not present
        return -1;
    }
}
