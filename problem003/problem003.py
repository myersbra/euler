# Largest Prime Factor
#
# The prime factors of 13195 are 5, 7, 13 and 29.
# What is the largest prime factor of the number 600851475143 ?

input = 600851475143
primeFactor = 1
while primeFactor <= input:
  primeFactor = 2
  while input % primeFactor:
    primeFactor += 1
  input /= primeFactor
print(primeFactor)
