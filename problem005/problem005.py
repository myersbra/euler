# Smallest Multiple
# 
# 2520 is the smallest number that can be divided by each
# of the numbers from 1 to 10 without any remainder.
#
# What is the smallest positive number that is evenly
# divisible by all of the numbers from 1 to 20?

import math

lower_limit = 1
upper_limit = 20
result = 0
is_evenly_divisible = False

divisors = []
for num in range(upper_limit/2, upper_limit + 1):
    divisors.append(num)

while not is_evenly_divisible:
    result += upper_limit
    is_evenly_divisible = True
    for i in divisors:
        if result % i != 0:
            is_evenly_divisible = False
            break
print(result)
