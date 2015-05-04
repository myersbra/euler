# Counting Sundays
# 
# You are given the following information, but you
# may prefer to do some research for yourself.
# 
#   1 Jan 1900 was a Monday.
#   Thirty days has September,
#   April, June and November.
#   All the rest have thirty-one,
#   Saving February alone,
#   Which has twenty-eight, rain or shine.
#   And on leap years, twenty-nine.
# 
# A leap year occurs on any year evenly divisible by 4,
# but not on a century unless it is divisible by 400.
# 
# How many Sundays fell on the first of the month during
# the twentieth century (1 Jan 1901 to 31 Dec 2000)?

count = 0
day = 2; #tuesday on 1901
for year in range (1901, 2001):
  # jan
  if day % 7 == 0:
      count += 1
  # mar, may, july, aug, oct, dec
  for i in range(0, 6):
    day += 3
    if day % 7 == 0:
      count += 1
  # apr, june, sept, nov
  for j in range(0, 4):
    day += 2
    if day % 7 == 0:
      count += 1
  # feb
  if (year % 4 == 0 and year % 100 != 0) or (year % 100 == 0 and year % 400 == 0):
    day += 1
  if day % 7 == 0:
    count += 1
  day += 3
print(count)