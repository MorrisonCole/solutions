package com.morrison.hacker_rank.skills.cracking_the_coding_interview.bubblesort;

import java.util.Scanner;

public class Solution {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int swaps = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swaps++;
                }
            }

        }

        System.out.printf("Array is sorted in %d swaps.%n", swaps);
        System.out.printf("First Element: %d%n", a[0]);
        System.out.printf("Last Element: %d", a[a.length - 1]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
