package com.morrisoncole.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

class RotateArrayTest {

    private RotateArray rotateArray = new RotateArray();

    @Test
    void rotatesEvenArray() {
        int[] input = new int[]{1, 2};
        List<Integer> expected = Arrays.asList(2, 1);

        rotateArray.rotate(input, 1);

        assertThat(input).asList()
                .containsExactlyElementsIn(expected).inOrder();
    }

    @Test
    void rotatesOddArray() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        List<Integer> expected = Arrays.asList(5, 6, 7, 1, 2, 3, 4);

        rotateArray.rotate(input, 3);

        assertThat(input).asList()
                .containsExactlyElementsIn(expected).inOrder();
    }

    @Test
    void doesNotRotateArrayWhenKIsZero() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        rotateArray.rotate(input, 0);

        assertThat(input).asList()
                .containsExactlyElementsIn(expected).inOrder();
    }

    @Test
    void returnsIdentityWhenKIsEqualToLength() {
        int[] input = new int[]{1, 2};
        List<Integer> expected = Arrays.asList(1, 2);

        rotateArray.rotate(input, 2);

        assertThat(input).asList()
                .containsExactlyElementsIn(expected).inOrder();
    }
}