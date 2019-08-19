package com.morrisoncole.solutions.hackerrank.skills.java.strings.stringsintroduction;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.printf("%s %s", capitalise(A), capitalise(B));
    }

    private static String capitalise(String string) {
        String capitalFirstLetter = string.substring(0, 1).toUpperCase();
        return capitalFirstLetter + string.substring(1);
    }
}
