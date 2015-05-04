# Number Letter Counts
#
# If the numbers 1 to 5 are written out in words: one, two, three, four, five,
# then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
#
# If all the numbers from 1 to 1000 (one thousand) inclusive
# were written out in words, how many letters would be used?
#
# NOTE: Do not count spaces or hyphens. For example, 342
# (three hundred and forty-two) contains 23 letters and 115
# (one hundred and fifteen) contains 20 letters. The use of
# "and" when writing out numbers is in compliance with British usage.

sum = 0
for i in range(1, 1001):
  num = str(i)
  if i % 100 < 10 or i % 100 >= 20:
    #find 1s digit for non teen numbers
    digit = num[len(num) - 1]
    if digit == '1' or digit == '2' or digit == '6':
      sum += 3
    if digit == '4' or digit == '5' or digit == '9':
      sum += 4
    if digit == '3' or digit == '7' or digit == '8':
      sum += 5
  else:
    #find 1s digit for teen numbers
    digit = num[len(num) - 1]
    if digit == '0':
      sum += 3
    if digit == '1' or digit == '2':
      sum += 6
    if digit == '5' or digit == '6':
      sum += 7
    if digit == '3' or digit == '4' or digit == '8' or digit == '9':
      sum += 8
    if digit == '7':
      sum += 9
  if i % 100 >= 20:
    #find 10s digit for non teen numbers
    digit = num[len(num) - 2]
    if digit == '4' or digit == '5' or digit == '6':
      sum += 5
    if digit == '2' or digit == '3' or digit == '8' or digit == '9':
      sum += 6
    if digit == '7':
      sum += 7
  if i >= 100 and i % 100 != 0:
    #find 100s digit
    digit = num[len(num) - 3]
    #include "hundred and"
    if digit == '1' or digit == '2' or digit == '6':
      sum += 13
    if digit == '4' or digit == '5' or digit == '9':
      sum += 14
    if digit == '3' or digit == '7' or digit == '8':
      sum += 15
  if i >= 100 and i % 100 == 0:
    digit = num[len(num) - 3]
    #include "hundred" but no "and"
    if digit == '1' or digit == '2' or digit == '6':
      sum += 10
    if digit == '4' or digit == '5' or digit == '9':
      sum += 11
    if digit == '3' or digit == '7' or digit == '8':
      sum += 12
  if i >= 1000:
    #add "one thousand"
    sum += 11
print(sum)