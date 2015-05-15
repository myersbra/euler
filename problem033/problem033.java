// The fraction 49/98 is a curious fraction, as an inexperienced mathematician in
// attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is
// correct, is obtained by cancelling the 9s.
// 
// We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
// 
// There are exactly four non-trivial examples of this type of fraction, less than
// one in value, and containing two digits in the numerator and denominator.
// 
// If the product of these four fractions is given in its lowest common terms,
// find the value of the denominator

import java.util.*;

class problem033 {
  public static List<Integer> getDigits(int x) {
    List<Integer> digits = new ArrayList<>();
    while (x > 0) {
      digits.add(x % 10);
      x /= 10;
    }
    return digits;
  }

  public static List<Integer> getSharedDigits(int num, int denom) {
    List<Integer> numDigits = getDigits(num);
    List<Integer> denomDigits = getDigits(denom);
    numDigits.retainAll(denomDigits);
    return numDigits;
  }

  public static double removeSharedDigit(int digit, int x) {
    int firstHalf = x;
    int secondHalf = 0;
    int temp;
    while (true) {
      temp = firstHalf % 10;
      firstHalf /= 10;
      if (temp == digit) break; 
      secondHalf = (secondHalf * 10) + temp;
    }
    return firstHalf * String.valueOf(secondHalf).length() + secondHalf;
  }

  public static void main(String[] args) {
    int finalNum = 1;
    int finalDenom = 1;
    for (int denom = 12; denom <= 99; denom++) {
      for (int num = 11; num < denom; num++) {
        List<Integer> sharedDigits = getSharedDigits(num, denom);
        if (sharedDigits.size() == 1 && sharedDigits.get(0) != 0) {
          int commonDigit = sharedDigits.get(0);
          double newNum = removeSharedDigit(commonDigit, num); 
          double newDenom = removeSharedDigit(commonDigit, denom);
          if (newNum / newDenom == (num + 0.0) / denom) {
            finalNum *= num;
            finalDenom *= denom;
          }
        }
      }
    }
    // find product, simplify fraction
    for (int i = 2; i <= finalNum; i++) {
      if (finalNum % i == 0 && finalDenom % i == 0) {
        finalNum /= i;
        finalDenom /= i;
        i = 2;
      }
    }
    System.out.println(finalDenom);
  }
}
