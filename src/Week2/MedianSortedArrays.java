package Week2;


//Median of Two Sorted Arrays
//        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//        The overall run time complexity should be O(log (m+n)).
//
//        Example1:
//        Input:nums1 = [1,3], nums2 = [2]
//        Output:2.00000
//        Explanation: merged array = [1,2,3] and median is 2.
//
//        Example2:
//        Input:nums1 = [1,2], nums2 = [3,4]
//        Output:2.50000
//        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
//
//        Constraints:
//
//
//        nums1.length == m
//
//        nums2.length == n
//
//        0 <= m <= 1000
//
//        0 <= n <= 1000
//
//        1 <= m + n <= 2000
//
//        -106 <= nums1[i], nums2[i] <= 106

import java.util.Arrays;

public class MedianSortedArrays{

    public static void main(String[] args){
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        int[] nums3 = {1,2};
        int[] nums4 = {3,4};

        System.out.println(medianSortedArrays(nums1, nums2));
        System.out.println(medianSortedArrays(nums3, nums4));
    }

    public static double medianSortedArrays(int[] x, int[] y){

//        Creates a new array with the length of both arrays lengths added together
        int[] merged = new int[x.length + y.length];

//        Adds each value of the first array into the merged array
        for(int i = 0; i < x.length; i++){
            merged[i] = x[i];
        }

//        Adds the values of the second array into the previous array. Starts out at the first arrays index and iterates the length of the second array
        for(int j = 0; j < y.length; j++){
            merged[x.length + j] = y[j];
        }
//        Uses java.util.Arrays to sort the merged array
        Arrays.sort(merged);

//        Finds the sum of the merged array
        double sum = 0;
        for(int k: merged){
            sum += k;
        }

//        Divides the sum of the values in the merged array by the array's length
        double mergedMedian = sum / merged.length;

        return mergedMedian;
    }
}