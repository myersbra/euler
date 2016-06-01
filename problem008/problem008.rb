# Largest Product in a Series
# 
# Find the greatest product of five consecutive digits 
# in the 1000-digit number in problem008.txt.

list = []

f = File.open("problem008.txt", 'r')
f.each_line do |line|
  list << line.chomp.split('')
end

puts list

# f = open ('problem008.txt', 'r');
# list = []
# for line in f:
#   line = line.rstrip()
#   for i in range(0, len(line)):
#     list.append(int(line[i]))

# product = 0
# largestProduct = 0
# for i in range (len(list) - 12):
#   product = int(list[i])
#   for j in range (1, 13):
#     product *= int(list[i+j])
#   if product > largestProduct:
#     largestProduct = product
# print(largestProduct)
