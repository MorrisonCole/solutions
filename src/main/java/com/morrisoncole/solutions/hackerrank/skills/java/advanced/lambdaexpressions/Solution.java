package com.morrisoncole.solutions.hackerrank.skills.java.advanced.lambdaexpressions;

import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    static PerformOperation isOdd() {
        return (int x) -> (x % 2) != 0;
    }

    static PerformOperation isPrime() {
        return (int x) -> {
            if (x < 2) {
                return false;
            } else if (x == 2) {
                return true;
            }

            int sqrt = (int) Math.sqrt(x);
            for (int i = 2; i <= sqrt; i += 2) {
                if (x % i == 0) {
                    return false;
                }
            }

            return true;
        };
    }

    static PerformOperation isPalindrome() {
        return (int x) -> {
            String forwards = Integer.toString(x);
            String backwards = new StringBuilder(forwards).reverse().toString();

            return forwards.equals(backwards);
        };
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
