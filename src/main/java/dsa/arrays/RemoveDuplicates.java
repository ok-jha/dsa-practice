package dsa.arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] arr) {
        // write your code here
        int slow=0,fast=0;
        while (fast<arr.length){
            if(arr[slow] == arr[fast])
                fast++;
            else {
                slow++;
                arr[slow] = arr[fast];
                fast++;
            }
        }
        return slow+1;
    }

    public static void main(String[] args) {

        // Test Case 1 - normal case
        int[] arr1 = {1, 1, 2, 3, 3, 4};
        int len1 = removeDuplicates(arr1);
        System.out.println(len1); // expected: 4
        System.out.println(java.util.Arrays.toString(
                java.util.Arrays.copyOf(arr1, len1))); // expected: [1, 2, 3, 4]

        // Test Case 2 - no duplicates
        int[] arr2 = {1, 2, 3};
        int len2 = removeDuplicates(arr2);
        System.out.println(len2); // expected: 3

        // Test Case 3 - all duplicates
        int[] arr3 = {5, 5, 5, 5};
        int len3 = removeDuplicates(arr3);
        System.out.println(len3); // expected: 1

        // Test Case 4 - single element
        int[] arr4 = {7};
        int len4 = removeDuplicates(arr4);
        System.out.println(len4); // expected: 1
    }
}