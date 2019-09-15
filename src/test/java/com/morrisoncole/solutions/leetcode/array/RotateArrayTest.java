package com.morrisoncole.solutions.leetcode.array;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

class RotateArrayTest {

    @Test
    @Ignore
    void rotatesArray() {
        RotateArray rotateArray = new RotateArray();
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        List<Integer> expected = Arrays.asList(5, 6, 7, 1, 2, 3, 4);

        rotateArray.rotate(input, 3);

        assertThat(input).asList()
                .containsExactlyElementsIn(expected).inOrder();
    }
}