package dsa.arrays;

import java.io.*;
import java.util.*;
import java.lang.*;

public class MaximumElement {


    static int findMax(int[] arr) {
        // write your code here
        int result= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>result)
                result = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

        // Test Case 1 - normal case
        int[] arr1 = {3, 7, 1, 9, 4};
        System.out.println("Max: " + findMax(arr1)); // expected: 9

        // Test Case 2 - single element
        int[] arr2 = {5};
        System.out.println("Max: " + findMax(arr2)); // expected: 5

        // Test Case 3 - all same elements
        int[] arr3 = {4, 4, 4, 4};
        System.out.println("Max: " + findMax(arr3)); // expected: 4

        // Test Case 4 - negative numbers
        int[] arr4 = {-3, -1, -7, -2};
        System.out.println("Max: " + findMax(arr4)); // expected: -1
    }
}
