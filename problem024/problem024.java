// Lexicographic Permutations
// 
// A permutation is an ordered arrangement of objects. For example,
// 3124 is one possible permutation of the digits 1, 2, 3 and 4.
// If all of the permutations are listed numerically or alphabetically,
// we call it lexicographic order. The lexicographic permutations of
// 0, 1 and 2 are:
// 
// 012   021   102   120   201   210
// 
// What is the millionth lexicographic permutation of the digits
// 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?

import java.io.*;

class problem024 {
  public static void main(String args[]) {
    System.out.println(permute("", "0123456789"));
  }

  static int counter = 1000000;

  static String permute(String s1, String s2) {
    String result = "";
    if (s2.length() <= 1) {
      counter--;
      result = (s1 + s2);
    }
    else {
      for (int i = 0; i < s2.length(); i++) {
        if (counter > 0) {
          result = permute(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
        }
      }
    }
    return result;
  }
}