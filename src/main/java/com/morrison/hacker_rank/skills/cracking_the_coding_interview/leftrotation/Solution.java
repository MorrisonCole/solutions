package com.morrison.hacker_rank.skills.cracking_the_coding_interview.leftrotation;

import java.util.Arrays;
        import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int leftRotations = scanner.nextInt();

        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[Math.floorMod(i - leftRotations, arraySize)] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array).replaceAll("[\\[\\],]", ""));
    }
}
