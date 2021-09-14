package com.mdipanjan;

public class Main {

    public static void main(String[] args) {
    //write a recursive function to print N to 1
        printN2One(5);

    }
    static void printN2One(int n){
       if(n <= 0) {
           return;
       }else {
           System.out.println(n);
           printN2One(n-1);
       }

    }
}
