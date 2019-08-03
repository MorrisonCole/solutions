package com.morrison.hacker_rank.skills.java.datastructures.twodarray;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        System.out.println(hourglassSum(arr));
    }

    static int hourglassSum(int[][] arr) {
        int sum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 2; i++) {
            int[] topRow = arr[i];
            int[] middleRow = arr[i + 1];
            int[] bottomRow = arr[i + 2];
            for (int j = 0; j < topRow.length - 2; j++) {
                int topRowSum = topRow[j] + topRow[j + 1] + topRow[j + 2];
                int middleRowSum = middleRow[j + 1];
                int bottomRowSum = bottomRow[j] + bottomRow[j + 1] + bottomRow[j + 2];

                int hourglassSum = topRowSum + middleRowSum + bottomRowSum;

                if (hourglassSum > sum) {
                    sum = hourglassSum;
                }
            }
        }

        return sum;
    }
}
