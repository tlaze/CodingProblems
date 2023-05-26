package Week4;

import java.util.Scanner;

//Write a program that accepts sets of three numbers, and prints the second-maximum number among the three.
//
//        Input
//
//
//        First line contains the number of triples, N.
//
//        The next N lines which follow each have three space separated integers.
//
//        Output
//        For each of the N triples, output one new line which contains the second-maximum integer among the three.
//
//        Constraints
//
//
//
//        1 ≤ N ≤ 6
//
//        1 ≤ every integer ≤ 10000
//
//        The three integers in a single triplet are all distinct. That is, no two of them are equal.
//
//        Sample Input
//        3
//        1 2 3
//        10 15 5
//        100 999 500
//        Sample Output
//        2
//        10
//        500

public class SecondMax {

    public static void main(String[] args){
        System.out.println(secondMax(5,6,10));
    }

    public static int secondMax(int num1, int num2, int num3){

        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));

        int secondMax = num1 + num2 + num3 - max - min;

        return secondMax;
    }
}
