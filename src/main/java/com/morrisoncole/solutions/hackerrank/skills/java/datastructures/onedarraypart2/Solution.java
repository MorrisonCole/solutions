package com.morrisoncole.solutions.hackerrank.skills.java.datastructures.onedarraypart2;

import java.util.Scanner;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return canWin(leap, game, 0);
    }

    private static boolean canWin(int leap, int[] game, int position) {
        if (position < 0 || game[position] == 1) {
            return false;
        } else if (position == game.length - 1 || position + leap > game.length - 1) {
            return true;
        }

        game[position] = 1;

        return canWin(leap, game, position + leap) || canWin(leap, game, position - 1) || canWin(leap, game, position + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
