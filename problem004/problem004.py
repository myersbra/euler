# Largest Palindrome Project
# 
# A palindromic number reads the same both ways. The largest palindrome 
# made from the product of two 2-digit numbers is 9009 = 91 * 99.
#
# Find the largest palindrome made from the product of two 3-digit numbers.

import math
highestPalindrome = 0
for x in range(100, 1000):
  for y in range(x, 1000):
    result = x * y
    resultString = str(x * y)
    if resultString == resultString[::-1] and (result > highestPalindrome):
      highestPalindrome = result
print(highestPalindrome)
