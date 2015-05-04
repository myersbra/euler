# Factorial Digit Sum
# 
# n! means n × (n − 1) × ... × 3 × 2 × 1
# 
# For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
# and the sum of the digits in the number 10! is
# 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
# 
# Find the sum of the digits in the number 100!

import math
number = str(math.factorial(100))
result = 0
for i in range(0, len(number)):
  result += int(number[i])
print(result)