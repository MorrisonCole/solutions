package com.morrisoncole.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    void returnsModifiedLength() {
        int[] input = {1, 1, 2};

        assertThat(removeDuplicatesFromSortedArray.removeDuplicates(input))
                .isEqualTo(2);
    }

    @Test
    void returnsZeroForEmptyArray() {
        int[] input = new int[0];

        assertThat(removeDuplicatesFromSortedArray.removeDuplicates(input))
                .isEqualTo(0);
    }
}