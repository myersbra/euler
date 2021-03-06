# 10001st Prime
# 
# By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
# we can see that the 6th prime is 13.
# 
# What is the 10 001st prime number?

import math
target = 10001
result = 1
counter = 0
while counter < target:
  result += 1
  isPrime = True # assume until proven false
  if counter <= 4:
    for i in range(2, result - 1):
      if result % i == 0:
        isPrime = False
  else:
    # check all values up to result/2 for factors
    for i in range(2, math.floor(result/2)):
      if result % i == 0:
        isPrime = False
        break
  if isPrime:
    counter += 1
print(result)