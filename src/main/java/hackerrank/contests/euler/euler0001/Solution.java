package hackerrank.contests.euler.euler0001;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            BigDecimal n = in.nextBigDecimal();

            System.out.println(arithmeticSum(BigDecimal.valueOf(3), n).add(arithmeticSum(BigDecimal.valueOf(5), n)).subtract(arithmeticSum(BigDecimal.valueOf(15), n)));
        }
    }

    private static BigInteger arithmeticSum(BigDecimal firstTermAndStep, BigDecimal limit) {
        BigDecimal numberOfTerms = limit.subtract(BigDecimal.ONE).divide(firstTermAndStep, RoundingMode.FLOOR);
        BigDecimal lastTerm = numberOfTerms.multiply(firstTermAndStep);
        return firstTermAndStep.add(lastTerm).divide(BigDecimal.valueOf(2)).multiply(numberOfTerms).toBigInteger();
    }
}

