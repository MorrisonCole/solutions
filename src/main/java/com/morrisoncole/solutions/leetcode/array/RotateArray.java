package com.morrisoncole.solutions.leetcode.array;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        if (k == 0) {
            return;
        }

        int temp;
        int correctPlacements = 0;

        for (int originalPosition = 0; correctPlacements < nums.length; originalPosition++) {
            int currentPosition = originalPosition;
            int previousValue = nums[originalPosition];

            do {
                int nextPosition = (currentPosition + k) % nums.length;
                temp = nums[nextPosition];
                nums[nextPosition] = previousValue;
                previousValue = temp;

                currentPosition = nextPosition;
                correctPlacements++;
            } while (currentPosition != originalPosition);
        }
    }
}
