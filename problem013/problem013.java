// Large Sum
// 
// Work out the first ten digits of the sum of
// the one-hundred 50-digit numbers in problem013.txt.

import java.io.*;
import java.util.*;
import java.math.BigInteger;

class problem013 {
  public static void main(String[] args) {
    try {
      BigInteger sum = BigInteger.ZERO;

      Scanner s = new Scanner(new File("problem013.txt"));
      while (s.hasNextLine()) {
        sum = sum.add(new BigInteger(s.nextLine()));
      }
      s.close();
      
      System.out.println(sum.toString().substring(0,10));
    }
    catch (FileNotFoundException e) {
      System.out.println(e);
    }
  }
}