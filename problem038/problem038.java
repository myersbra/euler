// Take the number 192 and multiply it by each of 1, 2, and 3:
// 
// 192 * 1 = 192
// 192 * 2 = 384
// 192 * 3 = 576
// 
// By concatenating each product we get the 1 to 9 pandigital, 192384576. We will
// call 192384576 the concatenated product of 192 and (1,2,3)
// 
// The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and
// 5, giving the pandigital, 918273645, which is the concatenated product of 9 and
// (1,2,3,4,5).
// 
// What is the largest 1 to 9 pandigital 9-digit number that can be formed as the
// concatenated product of an integer with (1,2, ... , n) where n > 1?

import java.util.*;

class problem038 {
  public static void main(String[] args) {
    long result = 0;
    for (int i = 1; i < 10000; i++) {
      long concatenatedProduct = (long) i;
      int multiplicand = 2;
      while (String.valueOf(concatenatedProduct).length() < 9 ) {
        concatenatedProduct *= (int) Math.pow(10, Integer.toString(i * multiplicand).length());
        concatenatedProduct += i * multiplicand;
        multiplicand++;
      }
      if (String.valueOf(concatenatedProduct).length() > 9) continue;
      List<String> allDigits = new ArrayList<>();
      for (int j = 1; j <= 9; j++) allDigits.add(Integer.toString(j));
      String concatenatedProductString = String.valueOf(concatenatedProduct);
      boolean containsAllDigits = true;
      for (String digit : allDigits) {
        if (!concatenatedProductString.contains(digit)) containsAllDigits = false;
      }
      if (containsAllDigits && concatenatedProduct > result) result = concatenatedProduct;
    }
    System.out.println(result);
  }
}
