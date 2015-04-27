# Largest Prime Factor
#
# The prime factors of 13195 are 5, 7, 13 and 29.
# What is the largest prime factor of the number 600851475143 ?

input = 600851475143
primeFactor = 1
loop do
  primeFactor = 2
  loop do
    break if input % primeFactor == 0
    primeFactor += 1
  end
  input /= primeFactor
  break if primeFactor > input
end
puts primeFactor
