# Lexicographic Permutations
# 
# A permutation is an ordered arrangement of objects. For example,
# 3124 is one possible permutation of the digits 1, 2, 3 and 4.
# If all of the permutations are listed numerically or alphabetically,
# we call it lexicographic order. The lexicographic permutations of
# 0, 1 and 2 are:
# 
# 012   021   102   120   201   210
# 
# What is the millionth lexicographic permutation of the digits
# 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?

import itertools
permutation = itertools.permutations(range(10))
for i in range(0, 999999):
  next(permutation)
array = next(permutation)
result = 0
for i in array:
  result = (result * 10) + i
print(result)