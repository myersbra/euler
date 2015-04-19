# Largest Prime Factor
#
# The prime factors of 13195 are 5, 7, 13 and 29.
# What is the largest prime factor of the number 600851475143 ?

# python solution
input = 600851475143
highestPrimeFactor = 1
while input > highestPrimeFactor:
    primeFactor = 2
    #increment upwards until a factor is found
    while input % primeFactor != 0:
        primeFactor = primeFactor + 1
    #replace value of highestPrimeFactor if necessary
    if primeFactor > highestPrimeFactor:
        highestPrimeFactor = primeFactor
    #update input
    input = input / primeFactor
print(highestPrimeFactor)
