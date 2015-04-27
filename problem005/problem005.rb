# Smallest Multiple
# 
# 2520 is the smallest number that can be divided by each
# of the numbers from 1 to 10 without any remainder.
#
# What is the smallest positive number that is evenly
# divisible by all of the numbers from 1 to 20?

x = 20

# delete first half of array since second half is that times 2
fac = (1...x).to_a
(x/2).times { fac.shift }

n = 0
loop do
  n += x
  break if fac.each { |f| true; break if n % f != 0}
end

puts n
