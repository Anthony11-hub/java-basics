package com.company;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));
        int[] newNumbers = {7,9,10,4,5,6};//Newer method for initializing arrays
        Arrays.sort(newNumbers);
        System.out.println(Arrays.toString(newNumbers));
        //multi-dimensional arrays -- we use deepToString
        int[][] numbers2 = new int[2][3];//meaning 2 rows and 3 columns
        numbers2 [0][0] = 1;
        System.out.println(Arrays.deepToString(numbers2));
        //multi-dimensional arrays using new method
        int[][] numbers3 = {{1,2,3,4}, {9,8,6,4,6}};
        System.out.println(Arrays.deepToString(numbers3));
    }
}
