package Vladik_1;

import java.math.BigInteger;

public class big {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 10; i++) {
            sum = sum.add(BigInteger.valueOf(i));
            System.out.println(sum);
        }
    }
}
