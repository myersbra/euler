# Maximum Path Sum I
#
# By starting at the top of the triangle below and moving to adjacent
# numbers on the row below, the maximum total from top to bottom is 23.
# 
#  3
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

# create empty array for sums
# create empty array for paths
sums = []
paths = []
for a in array:
  sums = [[] for i in a]
  paths = [None for i in a]
for b in range(0, array.__len__()):
  sums[b] = [0 for c in range(b + 1)]
  paths[b] = [[] for c in range(b + 1)]
sums[0][0] = array[0][0]
paths[0][0] = [array[0][0]]

# enter cumulative max sums into sums array
# enter cumulative max paths into paths array
for i in range(1, len(array)):
  for j in range(0, i + 1):
    if j == 0:
      sums[i][j] = array[i][j] + sums[i - 1][0]
      paths[i][j] = paths[i - 1][j][:]
      paths[i][j].append(array[i][j])
    elif j == i:
      sums[i][j] = array[i][j] + sums[i - 1][i - 1]
      paths[i][j] = paths[i - 1][j - 1][:]
      paths[i][j].append(array[i][j])
    else:
      # determine highest cumulative parent sum
      sums[i][j] = array[i][j] + max(sums[i - 1][j - 1], sums[i - 1][j])
      # determine index of highest sum to use as index of highest list
      maximum = paths[i - 1][sums[i - 1].index(max(sums[i - 1][j], sums[i - 1][j - 1]))][:]
      paths[i][j] = maximum[:]
      paths[i][j].append(array[i][j])
# determine result from bottom row
highest_sum = max(sums[len(array) - 1])
# print highest path
# print(paths[bottom_row][sums[bottom_row].index(highest_sum)])
print(highest_sum)