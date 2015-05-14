// A unit fraction contains 1 in the numerator. The decimal representation
// of the unit fractions with denominators 2 to 10 are given:
// 
// 1/2 =   0.5
// 1/3 =   0.(3)
// 1/4 =   0.25
// 1/5 =   0.2
// 1/6 =   0.1(6)
// 1/7 =   0.(142857)
// 1/8 =   0.125
// 1/9 =   0.(1)
// 1/10  =   0.1
// 
// Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle.
// It can be seen that 1/7 has a 6-digit recurring cycle.
// 
// Find the value of d < 1000 for which 1/d contains the longest
// recurring cycle in its decimal fraction part.

import java.util.*;
import java.math.BigInteger;

class problem026 {
  public static void main(String[] args) {
    int i = 999;
    // find highest prime
    for (i = 999; i > 0; i--) {
      boolean isPrime = true;
      for (int j = 2; j < Math.sqrt(i) + 1; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (!isPrime) continue;
      // check if 10 is primitive root
      List<Integer> primeFactors = new ArrayList<>();
      int copy = i - 1;
      int counter = 2;
      while (copy > 1) {
        while (copy % counter != 0) counter++;
        primeFactors.add(i/counter);
        copy /= counter;
      }
      boolean isRelativelyPrime = true;
      BigInteger ten = new BigInteger("10");
      for (int k : primeFactors) {
        BigInteger bigk = new BigInteger(Integer.toString(k));
        BigInteger bigi = new BigInteger(Integer.toString(i));
        if (ten.modPow(bigk, bigi).compareTo(BigInteger.ONE) == 0) {
          isRelativelyPrime = false;
          break;
        }
      }
      if (isRelativelyPrime) break;
    }
    System.out.println(i);
  }
}
