package com.morrisoncole.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    void returnsModifiedLength() {
        int[] input = {1, 1, 2};

        assertThat(removeDuplicatesFromSortedArray.removeDuplicates(input), equalTo(2));
    }

    @Test
    void returnsZeroForEmptyArray() {
        int[] input = new int[0];

        assertThat(removeDuplicatesFromSortedArray.removeDuplicates(input), equalTo(0));
    }
}