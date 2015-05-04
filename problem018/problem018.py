# Maximum Path Sum I
#
# By starting at the top of the triangle below and moving to adjacent
# numbers on the row below, the maximum total from top to bottom is 23.
# 
#    3
#   7 4
#  2 4 6
# 8 5 9 3
# 
# That is, 3 + 7 + 4 + 9 = 23.
# 
# Find the maximum total from top to bottom of the triangle in problem018.txt
# 
# NOTE: As there are only 16384 routes, it is possible to solve this problem
# by trying every route. However, Problem 67, is the same challenge with a
# triangle containing one-hundred rows; it cannot be solved by brute force,
# and requires a clever method!

array = []
with open('problem018.txt') as f:
  for line in f:
    arr = line.strip().split(" ")
    list = [int(i) for i in arr]
    array.append(list)

# enter cumulative max array into array array
for i in range(1, len(array)):
  for j in range(0, i + 1):
    if j == 0:
      array[i][j] = array[i][j] + array[i - 1][0]
    elif j == i:
      array[i][j] = array[i][j] + array[i - 1][i - 1]
    else:
      array[i][j] = array[i][j] + max(array[i - 1][j - 1], array[i - 1][j])

print(max(array[len(array) - 1]))