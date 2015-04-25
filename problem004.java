// Largest Palindrome Project
// 
// A palindromic number reads the same both ways. The largest palindrome 
// made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
// Find the largest palindrome made from the product of two 3-digit numbers.

int highestPalindrome = 0;
for (int x = 100; x < 1000; x++) {
    for (int y = x; y < 1000; y++) {
        int result = x * y;
        //string form to work with individual digits
        String resultString = Integer.toString(result);
        boolean isPalindrome = true; //assume until proven false
        for (int i = 0; i < (resultString.length() / 2); i++) {
            if (resultString.charAt(i) != resultString.charAt(resultString.length() - 1 - i)) {
                isPalindrome = false;
            }
        }
        if (isPalindrome && result > highestPalindrome) {
            highestPalindrome = result;
        }
    }
}
System.out.print(highestPalindrome);