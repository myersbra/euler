#!/usr/bin/perl
#
# Largest Prime Factor
#
# The prime factors of 13195 are 5, 7, 13 and 29.
# What is the largest prime factor of the number 600851475143 ?

use strict;

sub get_next_factor {
  my $factor = 2;
  while ($_[0] % $factor != 0) {
    $factor++;
  }
  $factor;
}

sub get_prime_factors {
  my @factors = ();
  while ($_[0] > 1) {
    my $next_factor = &get_next_factor;
    push(@factors, $next_factor);     
    $_[0] /= $next_factor;
  }
  @factors;
}

my $input = 600851475143;
my @factors = &get_prime_factors($input);
print pop(@factors), "\n";
