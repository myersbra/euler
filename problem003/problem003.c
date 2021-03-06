// Project Euler - Problem 3
// Largest Prime Factor
//
// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143?
//
// compilation command: gcc -lgmp problem003.c

#include <stdio.h> 
#include <gmp.h>

int main() {
  mpz_t input, primeFactor, mod; 
  mpz_inits(primeFactor, mod, NULL);
  mpz_init_set_str(input, "600851475143", 10);

  while (mpz_cmp(input, primeFactor) > 0) {
    mpz_set_ui(primeFactor, 1);
    do {
      mpz_add_ui(primeFactor, primeFactor, 1);
      mpz_mod(mod, input, primeFactor);
    } while (mpz_cmp_ui(mod, 0));
      mpz_fdiv_q(input, input, primeFactor);
  }
  mpz_out_str(stdout, 10, primeFactor);
  printf("\n");
}
