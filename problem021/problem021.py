# Amicable Numbers
# 
# Let d(n) be defined as the sum of proper divisors of n
# (numbers less than n which divide evenly into n).
# 
# If d(a) = b and d(b) = a, where a ≠ b, then a and b are an
# amicable pair and each of a and b are called amicable numbers.
# 
# For example, the proper divisors of 220 are
# 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
# The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
# 
# Evaluate the sum of all the amicable numbers under 10000.

final_sum = 0
for i in range(2, 10000):
  sum1 = 0
  sum2 = 0
  for j in range(1, i):
    if i % j == 0:
      sum1 += j
  for k in range(1, sum1):
    if sum1 % k == 0:
      sum2 += k
  if i == sum2 and i != sum1:
    final_sum += i
print(final_sum)