package dsa.arrays;

public class FindPairTargetSum {

    static int[] pairWithTargetSum(int[] arr, int target) {
        // write your code here
        int left =0, right = arr.length-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum == target)
                return new int[]{left, right};
            else if(sum > target)
                right--;
            else
                left++;
        }
        return new int[]{-1, -1}; // not found
    }

    public static void main(String[] args) {

        // Test Case 1 - pair exists
        int[] arr1 = {1, 3, 5, 7, 9};
        System.out.println(java.util.Arrays.toString(
                pairWithTargetSum(arr1, 12))); // expected: [1, 4]

        // Test Case 2 - no pair
        int[] arr2 = {1, 3, 5, 7, 9};
        System.out.println(java.util.Arrays.toString(
                pairWithTargetSum(arr2, 20))); // expected: [-1, -1]

        // Test Case 3 - pair at edges
        int[] arr3 = {1, 3, 5, 7, 9};
        System.out.println(java.util.Arrays.toString(
                pairWithTargetSum(arr3, 10))); // expected: [0, 4]

        // Test Case 4 - two elements only
        int[] arr4 = {2, 8};
        System.out.println(java.util.Arrays.toString(
                pairWithTargetSum(arr4, 10))); // expected: [0, 1]
    }
}
