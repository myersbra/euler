# If p is the perimeter of a right angle triangle with integral length sides,
# {a,b,c}, there are exactly three solutions for p = 120.
#
# {20,48,52}, {24,45,51}, {30,40,50}
#
# For which value of p <= 1000, is the number of solutions maximised?

import math
import operator
from collections import defaultdict

triplecounts = defaultdict(int)
c = 0

for a in range(1, 1000):
  for b in range(a, 1000):
    c = math.hypot(a, b)
    if c % 1 != 0.0:
      continue
    side_length_sum = a + b + int(c)
    if side_length_sum > 1000:
      break
    triplecounts[side_length_sum] += 1

print(max(triplecounts.iteritems(), key=operator.itemgetter(1))[0])
