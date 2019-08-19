package com.morrisoncole.solutions.hackerrank.skills.java.bignumber.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNumber = scanner.nextBigInteger();
        BigInteger secondNumber = scanner.nextBigInteger();

        System.out.println(firstNumber.add(secondNumber));
        System.out.println(firstNumber.multiply(secondNumber));
    }
}
