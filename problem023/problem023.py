# Non-Abundant Sums
# 
# A perfect number is a number for which the sum of its proper divisors
# is exactly equal to the number. For example, the sum of the proper
# divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 
# 28 is a perfect number.
# 
# A number n is called deficient if the sum of its proper divisors is
# less than n and it is called abundant if this sum exceeds n.
# 
# As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the
# smallest number that can be written as the sum of two abundant numbers
# is 24. By mathematical analysis, it can be shown that all integers
# greater than 28123 can be written as the sum of two abundant numbers.
# However, this upper limit cannot be reduced any further by analysis
# even though it is known that the greatest number that cannot be
# expressed as the sum of two abundant numbers is less than this limit.
# 
# Find the sum of all the positive integers which cannot be written as
# the sum of two abundant numbers.

import math
list = []
newlist = []
for i in range(1, 28124):
  newlist.append(i)
  sum = 0
  for j in range (1, math.ceil(math.sqrt(i))):
    if i % j == 0:
      sum += j
      sum += i / j
  if math.sqrt(i) % 1 == 0.0:
    sum += math.sqrt(i) # to ensure root is counted
  sum -= i # to remove the complement of 1 (1 * i = i, so i will be included in the sum at this point)
  if (sum > i):
    list.append(i)

truelist = [False for i in range(0,28124)]
for b in range(0, len(list)):
  for c in range(b, len(list)):
    if (list[b] + list[c] < 28124):
      truelist[list[b] + list[c]] = True
    else:
      break

sum = 0
for k in range(0, 28124):
  if truelist[k] == False:
     sum += k
print(sum)