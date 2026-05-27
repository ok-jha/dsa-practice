package dsa.arrays;

public class ReverseArray {


    static void reverseArray(int[] arr) {
        // write your code here
        int start=0, end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        // Test Case 1 - odd length
        int[] arr1 = {1, 2, 3, 4, 5};
        reverseArray(arr1);
        System.out.println(java.util.Arrays.toString(arr1)); // expected: [5, 4, 3, 2, 1]

        // Test Case 2 - even length
        int[] arr2 = {1, 2, 3, 4};
        reverseArray(arr2);
        System.out.println(java.util.Arrays.toString(arr2)); // expected: [4, 3, 2, 1]

        // Test Case 3 - single element
        int[] arr3 = {7};
        reverseArray(arr3);
        System.out.println(java.util.Arrays.toString(arr3)); // expected: [7]

        // Test Case 4 - two elements
        int[] arr4 = {1, 2};
        reverseArray(arr4);
        System.out.println(java.util.Arrays.toString(arr4)); // expected: [2, 1]
    }
}
