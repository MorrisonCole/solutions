package com.morrison.hacker_rank.skills.java.datastructures.hashset;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> pairs = new HashSet<>();
        for (int i = 0; i < t; i++) {
            pairs.add(String.format("%s %s", pair_left[i], pair_right[i]));
            System.out.println(pairs.size());
        }
    }
}