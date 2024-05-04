package org.example;

import java.math.BigInteger;

public class Problem03 {

    public static BigInteger fact(int n) {
        //space complexity of O(1), time complexity of O(x)
        BigInteger x = new BigInteger("1");
        for(int i = 1; i <= n; i++) {
            x = x.multiply(BigInteger.valueOf(i));
        }
        return x;
    }

    public static long testSevens(int n) {
        //Space complexity of O(1)
        BigInteger num1, num2;
        long sum = 0;
        long total = 0;

        //time complexity of O(n^2)
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++) {
                num1 = fact(i);
                num2 = fact(j);
                if (   (num1.divide   (    num2.multiply(    fact(i - j)   )   ).mod(   BigInteger.valueOf(7)   ) .equals(BigInteger.valueOf(0))))
                    sum++;
                total ++;
            }
        }

        return total - sum;
    }

    //total time complexity is O(n^2 * x) where x corresponds to the size of the largest number produced by the Combination formula in the loop
    //space complexity is O(1)
}
