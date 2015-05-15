// The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.
// 
// Find the sum of all numbers, less than one million, which are palindromic in
// base 10 and base 2.
// 
// (Please note that the palindromic number, in either base, may not include
// leading zeros.)

class problem036 {
  public static boolean isPalindrome(String s) {
    boolean result = true;
    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        result = false;
        break;
      }
    }
    return result;
  }

  public static boolean isPalindrome(int x) {
    int copy = x;
    int rev = 0;
    while (copy > 0) {
      rev = (rev * 10) + (copy % 10);
      copy /= 10;
    }
    return (x == rev);
  }

  public static void main(String[] args) {
    int result = 0;
    for (int i = 0; i < 1000000; i++) {
      if (isPalindrome(i) && isPalindrome(Integer.toString(i, 2))) result += i;
    }
    System.out.println(result);
  }
}
