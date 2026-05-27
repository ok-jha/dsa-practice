package dsa.arrays;

public class SecondLargest {

    static int findSecondMax(int[] arr) {
        int firstLargest = arr[0], secondLargest = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
                continue;
            }
            if(arr[i] < firstLargest && secondLargest < arr[i]){
                secondLargest = arr[i];
            }

        }
        return secondLargest;
    }

    public static void main(String[] args) {

        // Test Case 1 - normal case
        int[] arr1 = {3, 7, 1, 9, 4};
        System.out.println(findSecondMax(arr1)); // expected: 7

        // Test Case 2 - second largest at start
        int[] arr2 = {9, 7, 1, 3, 4};
        System.out.println(findSecondMax(arr2)); // expected: 7

        // Test Case 3 - two elements
        int[] arr3 = {1, 2};
        System.out.println(findSecondMax(arr3)); // expected: 1

        // Test Case 4 - duplicates of max
        int[] arr4 = {-5, -5, -3};
        System.out.println(findSecondMax(arr4)); // expected: 3
    }
}
