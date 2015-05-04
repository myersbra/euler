# Power Digit Sum
#
# 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
# What is the sum of the digits of the number 2^1000?

import math
sum = 0
max = 1000
number = str(int(math.pow(2, max)))
for i in range(0, number.__len__()):
  sum += int(number[i])
print(sum)