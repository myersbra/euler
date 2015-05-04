# Large Sum
# 
# Work out the first ten digits of the sum of
# the one-hundred 50-digit numbers in problem013.txt.

total = 0
with open('problem013.txt') as f:
  for line in f:
    total += int(line)
print(str(total)[:10])