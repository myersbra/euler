# Summation of Primes
# 
# The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
# Find the sum of all the primes below two million.

import math
sum = 2
isPrime = True
for i in range (3, 2000000):
  for j in range (2, int(math.sqrt(i)) + 1):
    isPrime = True # assume until proven false
    if i % j == 0:
      isPrime = False
      break
  if isPrime:
    sum += i
  i += 1
print(sum)
