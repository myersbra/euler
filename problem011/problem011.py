# Largest Product in a Grid
#
# In the 20×20 grid below, four numbers along a diagonal line have been marked in red.
#
# The product of these numbers is 26 × 63 × 78 × 14 = 1788696.
#
# What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?

largestProduct = 0
# check horizontal products
for y in range(0, 20):
  for x in range(0, 20 - 3):
    product = array[y][x]
    for i in range(x + 1, x + 4):
      product *= array[y][i]
    if product > largestProduct:
      largestProduct = product

# check vertical products
for x in range(0, 20):
  for y in range(0, 20 - 3):
    product = array[y][x]
    for i in range(y + 1, y + 4):
      product *= array[i][x]
    if product > largestProduct:
      largestProduct = product

# check diagonal products
for y in range(0, 20 - 3):
  for x in range(0, 20 - 3):
    product = array[y][x]
    for i in range(1, 4):
      product *= array[y + i][x + i]
    if product > largestProduct:
      largestProduct = product

for y in range(0 + 3, 20):
  for x in range(0, 20 - 3):
    product = array[y][x]
    for i in range(1, 4):
      product *= array[y - i][x + i]
    if product > largestProduct:
      largestProduct = product

print(largestProduct)