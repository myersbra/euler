// Power Digit Sum
//
// 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
// What is the sum of the digits of the number 2^1000?

import java.math.BigInteger;

class problem016 {
  public static void main(String[] args) {
    int sum = 0;
    String number = (new BigInteger("2")).pow(1000).toString();
    for (int i = 0; i < number.length(); i++) {
      sum += number.charAt(i) - '0';
    }
    System.out.println(sum);
  }
}