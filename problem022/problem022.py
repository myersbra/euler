# Names Scores
# 
# Using names.txt (right click and 'Save Link/Target As...'),
# a 46K text file containing over five-thousand first names,
# begin by sorting it into alphabetical order. Then working out
# the alphabetical value for each name, multiply this value by
# its alphabetical position in the list to obtain a name score.
# 
# For example, when the list is sorted into alphabetical order,
# COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th
# name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
# 
# What is the total of all the name scores in the file?

import re
import string

with open('names.txt') as f:
  for line in f:
    array = re.compile('","|"').split(line)
array.pop(0)
array.pop(len(array) - 1)

list = sorted(array)
totalSum = 0
for i in list:
  sum = 0
  for j in range(0, len(i)):
    sum += string.ascii_uppercase.index(i[j]) + 1
  totalSum += (list.index(i) + 1) * sum
print(totalSum)