// 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
// 
// Find the sum of all numbers which are equal to the sum of the factorial of
// their digits.
// 
// Note: as 1! = 1 and 2! = 2 are not sums they are not included.

import java.util.*;

class problem034 {
  public static int getDigitFactorialSum(int x) {
    int sum = 0;
    while (x > 0) {
      int digit = x % 10;
      int factorial = 1;
      for (; digit > 1; digit--) {
        factorial *= digit;
      }
      x /= 10;
      sum += factorial;
    }
    return sum;
  }

  public static void main(String[] args) {
    int result = 0;
    for (int i = 3; i < 100000; i++) {
      if (i == getDigitFactorialSum(i)) result += i;
    }
    System.out.println(result);
  }
}
