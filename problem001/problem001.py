# Multiples of 3 and 5
# 
# If we list all the natural numbers below 10 that are multiples
# of 3 or 5, we get 3, 5, 6 and 9.The sum of these multiples is 23.
#
# Find the sum of all the multiples of 3 or 5 below 1000.

import time
# first method
start = time.perf_counter()
result = 0
for x in range(0, 1000):
    if x % 3 == 0 or x % 5 == 0:
        result += x
print(result)
print(time.perf_counter() - start)

# second method
# start2 = time.perf_counter()
# result2 = 0
# for x in range(0, 1000, 3):
#     result2 += x
# for x in range(0, 1000, 5):
#     result2 += x
# print(result2)
# print(time.perf_counter() - start2)

# third method
# def sum(a, b, c):
#     # import math
#     x = math.floor((b - a) / c)
#     return (int((x + 1) * a + ((x * (x + 1)) / 2) * c))

# import math 		# importing math outside function call increases speed by factor of 10
# start3 = time.perf_counter()
# print(sum(0, 1000, 3) + sum(0, 1000, 5))
# print(time.perf_counter() - start3)
# print(result)