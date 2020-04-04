package com.morrisoncole.solutions.leetcode;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class HappyNumberTest {
    private final HappyNumber happyNumber = new HappyNumber();

    @Test
    void determinesHappyNumber() {
        boolean result = happyNumber.isHappy(19);

        assertThat(result).isTrue();
    }
}
