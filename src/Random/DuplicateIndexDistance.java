package Random;


//Given an array of integers, print out an array where at each index i,
// the total distance from i to every other duplicate element of i in the array is shown.
// For example, if the array was [1,3,1,1,2], the answer would be: [5,0,3,4,0].


import java.util.*;
public class DuplicateIndexDistance {

    public static void main(String[]args){

        int [] arr = new int[]{1,3,1,1,2};

        System.out.println(Arrays.toString(duplicateIndexDistance(arr)));
    }

    public static int[] duplicateIndexDistance(int[] arr){

        int val = arr[0];
        int sum = 0;
        int[] newArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                sum+=i;
                newArr[i] = sum;
            }
        }
        System.out.println(Arrays.toString(newArr));

        return arr;
    }
}
