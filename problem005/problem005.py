# Smallest Multiple
# 
# 2520 is the smallest number that can be divided by each
# of the numbers from 1 to 10 without any remainder.
#
# What is the smallest positive number that is evenly
# divisible by all of the numbers from 1 to 20?

lowerLimit = 1
upperLimit = 20 # single point of control
result = 0
isEvenlyDivisible = False
while not isEvenlyDivisible:
  result += upperLimit
  isEvenlyDivisible = True
  for i in range(lowerLimit, upperLimit + 1):
    if result % i != 0:
      isEvenlyDivisible = False
      break # to save runtime
print(result)
