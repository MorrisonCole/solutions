package com.morrisoncole.solutions.hackerrank.skills.minimumswaps2;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    private static int minimumSwaps(int[] arr) {
        HashMap<Integer, Integer> actualPositionMap = new HashMap<>();

        int[] arrSorted = arr.clone();
        Arrays.sort(arrSorted);

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            actualPositionMap.put(element, i);
        }

        int swaps = 0;

        for (int i = 0; i < arr.length; i++) {
            int correctElement = arrSorted[i];

            int actualElement = arr[i];
            if (actualElement != correctElement) {
                Integer correctElementPosition = actualPositionMap.get(correctElement);
                arr[correctElementPosition] = actualElement;
                actualPositionMap.replace(actualElement, correctElementPosition);
                arr[i] = correctElement;
                swaps++;
            }
        }

        return swaps;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        System.out.println(res);

        scanner.close();
    }
}
