package com.morrison.hacker_rank.skills.java.bignumber.bigdecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s, (o1, o2) -> {
            if (o1 == null || o2 == null) {
                return 0;
            }

            BigDecimal firstBigDecimal = new BigDecimal(o1);
            BigDecimal secondBigDecimal = new BigDecimal(o2);

            int comparison = firstBigDecimal.compareTo(secondBigDecimal);
            if (comparison < 0) {
                return 1;
            } else if (comparison > 0) {
                return -1;
            } else {
                return 0;
            }
        });

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}