// The Fibonacci sequence is defined by the recurrence relation:
// 
// Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
// Hence the first 12 terms will be:
// 
// F1 = 1
// F2 = 1
// F3 = 2
// F4 = 3
// F5 = 5
// F6 = 8
// F7 = 13
// F8 = 21
// F9 = 34
// F10 = 55
// F11 = 89
// F12 = 144
// The 12th term, F12, is the first term to contain three digits.
// 
// What is the index of the first term in the Fibonacci sequence
// to contain 1000 digits?

import java.math.BigInteger;

class problem025 {
  public static void main(String[] args) {
    BigInteger i = new BigInteger("1");
    BigInteger j = new BigInteger("2");
    BigInteger k = i.add(j);
    BigInteger thousandDigits = new BigInteger("1000");
    BigInteger result = new BigInteger("1000");
    for (int n = 0; n < 332; n++) result = result.multiply(thousandDigits);
    int counter = 4;
    while (k.compareTo(result) < 0) {
      i = j;
      j = k;
      k = i.add(j);
      counter++;
    }
    System.out.println(k.toString().length());
  }
}
