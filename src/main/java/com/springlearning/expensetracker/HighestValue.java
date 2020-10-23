package com.springlearning.expensetracker;

public class HighestValue {

    public static int printMax(int a, int b, int c) {

        int max = a;

        if (max < b) {
            max = b;
        }
        if (max < c){
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(printMax(-3, 2, -6));
    }
}

