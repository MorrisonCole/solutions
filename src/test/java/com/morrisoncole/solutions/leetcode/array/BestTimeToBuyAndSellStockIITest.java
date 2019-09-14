package com.morrisoncole.solutions.leetcode.array;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class BestTimeToBuyAndSellStockIITest {

    @Test
    void findsMaximumProfit() {
        int[] input = {7, 1, 5, 3, 6, 4};

        assertThat(new BestTimeToBuyAndSellStockII().maxProfit(input))
                .isEqualTo(7);
    }

    @Test
    void returnsZeroWhenNoProfitIsPossible() {
        int[] input = {7, 6, 4, 3, 1};

        assertThat(new BestTimeToBuyAndSellStockII().maxProfit(input))
                .isEqualTo(0);
    }

    @Test
    void findsMaximumProfitWhenAlwaysAscending() {
        int[] input = {1, 2, 3, 4, 5};

        assertThat(new BestTimeToBuyAndSellStockII().maxProfit(input))
                .isEqualTo(4);
    }
}