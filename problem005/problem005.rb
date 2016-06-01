# Smallest Multiple
# 
# 2520 is the smallest number that can be divided by each
# of the numbers from 1 to 10 without any remainder.
#
# What is the smallest positive number that is evenly
# divisible by all of the numbers from 1 to 20?

fac = (11...20).to_a

n = 0
loop do
  n += 20
  break if fac.each { |f| true; break if n % f != 0}
end

puts n
