package com.morrisoncole.solutions.hackerrank.skills.algorithms.strings.two_strings;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class TwoStringsRemoveDuplicatesFromSortedArrayTest {

    private final TwoStringsSolution twoStringsSolution = new TwoStringsSolution();

    @Test
    void returnsYesWhenContainsSubstring() {
        String result = twoStringsSolution.containsSubstring("hello", "world");

        assertThat(result)
                .isEqualTo("YES");
    }

    @Test
    void returnsNoWhenDoesNotContainSubstring() {
        String result = twoStringsSolution.containsSubstring("hi", "world");

        assertThat(result)
                .isEqualTo("NO");
    }
}
