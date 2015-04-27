# Largest Palindrome Project
# 
# A palindromic number reads the same both ways. The largest palindrome 
# made from the product of two 2-digit numbers is 9009 = 91 × 99.
#
# Find the largest palindrome made from the product of two 3-digit numbers.

highest_palindrome = 0
(100...1000).to_a.each do |x|
  (x...1000).to_a.each do |y|
    num = (x * y)
    if num.to_s == num.to_s.reverse && num > highest_palindrome
      highest_palindrome = num
    end
  end
end

puts highest_palindrome
