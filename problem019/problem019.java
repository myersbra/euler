// Counting Sundays
// 
// You are given the following information, but you
// may prefer to do some research for yourself.
// 
//   1 Jan 1900 was a Monday.
//   Thirty days has September,
//   April, June and November.
//   All the rest have thirty-one,
//   Saving February alone,
//   Which has twenty-eight, rain or shine.
//   And on leap years, twenty-nine.
// 
// A leap year occurs on any year evenly divisible by 4,
// but not on a century unless it is divisible by 400.
// 
// How many Sundays fell on the first of the month during
// the twentieth century (1 Jan 1901 to 31 Dec 2000)?

class problem019 {
  public static void main(String[] args) {
    int count = 0;
    int day = 2; //tuesday on 1901
    for (int year = 1901; year < 2001; year++) {
      //jan
      if (day % 7 == 0) count += 1;
      //mar, may, june, july, aug, oct, dec
      for (int i = 0; i < 6; i++) {
        day += 3;
        if (day % 7 == 0) count += 1;
      }
      //apr, june, sept, nov
      for (int j = 0; j < 4; j++) {
        day += 2;
        if (day % 7 == 0) count += 1;
      }
      //feb
      if ((year % 4 == 0 && year % 100 != 0)
        || (year % 100 == 0 && year % 400 == 0)) day += 1;
      if (day % 7 == 0) count += 1;
      day += 3;
    }
    System.out.println(count);
  }
}