package com.morrisoncole.solutions.hackerrank.skills.java.strings.patternsyntaxchecker;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            if (!in.hasNext()) {
                return;
            }

            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(PatternSyntaxException patternSyntaxException) {
                System.out.println("Invalid");
            }
        }
    }
}
