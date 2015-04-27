// Largest Palindrome Project
// 
// A palindromic number reads the same both ways. The largest palindrome 
// made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
// Find the largest palindrome made from the product of two 3-digit numbers.

class problem004 {
  public static void main(String[] args) {
    int highestPalindrome = 0;
    int result, rev;
    for (int x = 100; x < 1000; x++) {
      for (int y = x; y < 1000; y++) {
        rev = 0;
        result = x * y;
        while (result > 0) {
          rev = (rev * 10) + (result % 10);
          result /= 10;
        }
        if (rev == x * y && rev > highestPalindrome) {
          highestPalindrome = rev;
        }
      }
    }
    System.out.println(highestPalindrome);
  }
}
