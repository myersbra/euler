# Lattice Paths
#
# Starting in the top left corner of a 2×2 grid, and only being able to move
# to the right and down, there are exactly 6 routes to the bottom right corner.
#
# How many such routes are there through a 20×20 grid?

gridLength = 20
# create matrix
grid = [[0 for x in range(gridLength + 1)] for y in range(gridLength + 1)]
# iterate through, storing values
for i in range(gridLength + 1):
    grid[i][0] = 1
for j in range(gridLength + 1):
    grid[0][j] = 1
for i in range(1, gridLength + 1):
    for j in range(1, gridLength + 1):
        grid[i][j] = grid[i - 1][j] + grid[i][j - 1]
        
print(grid[gridLength][gridLength])