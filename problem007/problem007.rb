# 10001st Prime
# 
# By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
# we can see that the 6th prime is 13.
# 
# What is the 10 001st prime number?

result = 2
counter = 1

loop do
  result += 1
  if (2..Math.sqrt(result).ceil).to_a.all? { |i| result % i != 0 }
    counter += 1
  end
  break if counter == 10001
end

puts result