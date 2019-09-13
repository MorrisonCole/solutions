package com.morrisoncole.solutions.leetcode.array;

public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int boughtAt = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            int current = prices[i];
            int next = i == prices.length - 1 ? Integer.MIN_VALUE : prices[i + 1];

            if (boughtAt > Integer.MIN_VALUE) {
                if (i == prices.length - 1 || next < current) {
                    profit += current - boughtAt;
                    boughtAt = Integer.MIN_VALUE;
                }
            } else if (next > current) {
                boughtAt = current;
            }
        }

        return profit;
    }
}
