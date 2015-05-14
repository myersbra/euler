// We shall say that an n-digit number is pandigital if it makes use of all the
// digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1
// through 5 pandigital.
// 
// The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing
// multiplicand, multiplier, and product is 1 through 9 pandigital.
// 
// Find the sum of all products whose multiplicand/multiplier/product identity
// can be written as a 1 through 9 pandigital.
// 
// HINT: Some products can be obtained in more than one way so be sure to only
// include it once in your sum.

import java.util.*;

class problem032 {
  public static void main(String[] args) {
    int result = 0;
    List<Integer> productList = new ArrayList<>();
    for (int i = 1; i <= 98; i++) {
      // if (i % 10 == (i / 10) % 10) continue;
      for (int j = 123; j <= 10000; j++) {
        if (j % 10 == (j / 10) % 10 || j % 10 == (j / 100) % 10 || (j / 10) % 10 == (j / 100) % 10) continue;
        int product = i * j;
        // if (product >= 10000) break;
        List<Integer> digits = new ArrayList<>();
        for (int k = 1; k <= 9; k++) digits.add(k);
        digits.remove(new Integer(i % 10));
        digits.remove(new Integer((i / 10) % 10));
        digits.remove(new Integer(j % 10));
        digits.remove(new Integer((j / 10) % 10));
        digits.remove(new Integer((j / 100) % 10));
        digits.remove(new Integer(product % 10));
        digits.remove(new Integer((product / 10) % 10));
        digits.remove(new Integer((product / 100) % 10));
        digits.remove(new Integer((product / 1000) % 10));
        if (digits.size() ==  0 && !productList.contains(product)) {
          System.out.println(i + " * " + j + " = " + i * j);
          result += product;
          productList.add(product);
        }
      }
    }
    System.out.println(result);
  }
}
