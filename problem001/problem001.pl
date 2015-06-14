#!/usr/bin/perl
#
# Multiples of 3 and 5
# 
# If we list all the natural numbers below 10 that are multiples
# of 3 or 5, we get 3, 5, 6 and 9.The sum of these multiples is 23.
#
# Find the sum of all the multiples of 3 or 5 below 1000.

use strict;

sub cumulative_even_sum {
  my $result;
  for (my $i = 0; $i < $_[0]; $i++) {
    $result += $i if $i % 3 == 0 or $i % 5 == 0;
  }
  $result;
}

print &cumulative_even_sum(1000), "\n";
