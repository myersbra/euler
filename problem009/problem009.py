# Special Pythagorean Triplet
# 
# A Pythagorean triplet is a set of three natural numbers,
# a < b < c, for which, a2 + b2 = c2
# 
# For example, 32 + 42 = 9 + 16 = 25 = 52.
# 
# There exists exactly one Pythagorean triplet for which
# a + b + c = 1000. Find the product abc.

import math
result = None
for a in range (0, 1000):
  for b in range (a + 1, 1001):
    c = math.sqrt(a ** 2 + b ** 2)
    if a + b + c == 1000.0 and b < c:
      result = a * b * c
print(int(result))