#!/usr/bin/perl
#
# Largest Palindrome Project
# 
# A palindromic number reads the same both ways. The largest palindrome 
# made from the product of two 2-digit numbers is 9009 = 91 × 99.
#
# Find the largest palindrome made from the product of two 3-digit numbers.

sub is_palindrome {
  my $temp = $_[0];
  my $rev;
  while ($temp >= 1) {
    $rev = ($rev * 10) + ($temp % 10);
    $temp /= 10;
  }
  $_[0] == $rev;
}

sub find_highest_product_palindrome_between {
  $highest_palindrome;
  for (my $i = $_[0]; $i <= $_[1]; $i++) {
    for (my $j = $i; $j <= $_[1]; $j++) {
      $product = $i * $j;
      if (&is_palindrome($product) && $product > $highest_palindrome) {
        $highest_palindrome = $product;
      }
    }
  }
  $highest_palindrome;
}

print &find_highest_product_palindrome_between(100, 999), "\n";
