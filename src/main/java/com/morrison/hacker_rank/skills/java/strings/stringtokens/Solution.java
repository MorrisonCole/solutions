package com.morrison.hacker_rank.skills.java.strings.stringtokens;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String trimmedString = s.trim();
        if (trimmedString.length() == 0) {
            System.out.println("0");
            return;
        }

        String[] tokens = trimmedString.split("[ !,?._'@]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }

        scan.close();
    }
}

