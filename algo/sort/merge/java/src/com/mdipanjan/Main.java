package com.mdipanjan;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] arr = {12,54,24,28,25,47,259,55,88,96,5,4,88,5,85,1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int [] arr){
        int n = arr.length;
        if(n < 2 ) return;
        int middle = n/2;
        int [] left = new int [middle];
        int [] right = new int [n - middle];
        for (int i = 0; i < middle; i++){
            left[i] = arr[i];
        }
        for (int i = middle; i < n ; i++){
            right[i - middle] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr, middle, (n -middle));

    }

    public static void merge(int[] left, int [] right, int [] arr, int leftLength, int rightLength ) {
        int i = 0; // Index for Left array
        int j = 0; // Index for Right array
        int k = 0; // Index for Main Array
        // When both Left and Right array has elements
        while (i < leftLength && j < rightLength){
            if(left[i] < right[j]){
               arr[k] = left[i];
               i = i+1;
            }else{
                arr[k] = right[j];
                j = j+1;
            }
            k = k+1;

        }
        // When Only Left has elements
        while (i < leftLength){
            arr[k] = left[i];
            i=i+1;
            k = k+1;
        }
        // When Only Right has elements
        while (j < rightLength){
            arr[k] = right[j];
            j = j+1;
            k = k+1;
        }


    }
}
