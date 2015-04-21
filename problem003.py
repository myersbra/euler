# Largest Prime Factor
#
# The prime factors of 13195 are 5, 7, 13 and 29.
# What is the largest prime factor of the number 600851475143 ?

# python solution
input = 600851475143
primeFactor = 1
result = 1
while primeFactor <= input:
    if input % primeFactor == 0:
        result = primeFactor
        input = input / primeFactor
        primeFactor = 1
    primeFactor = primeFactor + 1
print(result)
