package hackerrank.java.datastructures.subarray;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int negativeSubArrays = 0;
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();

            int runningSum = 0;
            for (int j = i; j >= 0; j--) {
                runningSum += input[j];
                if (runningSum < 0) {
                    negativeSubArrays++;
                }
            }
        }

        System.out.println(negativeSubArrays);
    }
}

