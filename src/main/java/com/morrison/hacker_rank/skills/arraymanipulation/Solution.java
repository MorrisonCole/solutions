package com.morrison.hacker_rank.skills.arraymanipulation;

import java.util.Scanner;

public class Solution {

    private static long arrayManipulation(int n, int[][] queries) {
        long[] differenceArray = new long[n + 1];

        for (int[] query : queries) {
            int start = query[0] - 1;
            int end = query[1] - 1;
            int add = query[2];

            long newStart = differenceArray[start] + add;
            differenceArray[start] = newStart;
            long newEnd = differenceArray[end + 1] -= add;
            differenceArray[end + 1] = newEnd;
        }

        long currentDifference = 0;
        long maximumDifference = 0;

        for (long difference : differenceArray) {
            currentDifference += difference;
            if (currentDifference > maximumDifference) {
                maximumDifference = currentDifference;
            }
        }

        return maximumDifference;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        System.out.println(result);

        scanner.close();
    }
}
