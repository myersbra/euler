// An irrational decimal fraction is created by concatenating the positive
// integers:
// 
// 0.12345678910(1)112131415161718192021...
// 
// It can be seen that the 12th digit of the fractional part is 1.
// 
// If d_n represents the nth digit of the fractional part, find the value of
// the following expression.
// 
// d_1 × d_10 × d_100 × d_1000 × d_10000 × d_100000 × d_1000000

import java.util.*;

class problem040 {
  public static void main(String[] args) {
    List<Integer> decimals = new ArrayList<>();
    int counter = 1;
    while (decimals.size() < 1000000) {
      int next = counter;
      List<Integer> nextDigits = new ArrayList<>();
      while (next > 0) {
        nextDigits.add(next % 10);
        next /= 10;
      }
      Collections.reverse(nextDigits);
      decimals.addAll(nextDigits);
      counter++;
    }
    long result = 1;
    for (int i = 0; i <= 1000000; i = (i * 10) + 9) {
      result *= decimals.get(i);
    }
    System.out.println(result);
  }
}
