// Number Letter Counts
//
// If the numbers 1 to 5 are written out in words: one, two, three, four, five,
// then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
//
// If all the numbers from 1 to 1000 (one thousand) inclusive
// were written out in words, how many letters would be used?
//
// NOTE: Do not count spaces or hyphens. For example, 342
// (three hundred and forty-two) contains 23 letters and 115
// (one hundred and fifteen) contains 20 letters. The use of
// "and" when writing out numbers is in compliance with British usage.

class problem017 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i < 1001; i++) {
      String num = Integer.toString(i);
      if (i % 100 < 10 || i % 100 >= 20) {
        //find 1s digit for non teen numbers
        char digit = num.charAt(num.length() - 1);
        if (digit == '1' || digit == '2' || digit == '6') sum += 3;        
        if (digit == '4' || digit == '5' || digit == '9') sum += 4;        
        if (digit == '3' || digit == '7' || digit == '8') sum += 5;        
      }
      else {
        //find 1s digit for teen numbers
        char digit = num.charAt(num.length() - 1);
        if (digit == '0') sum += 3;        
        if (digit == '1' || digit == '2') sum += 6;        
        if (digit == '5' || digit == '6') sum += 7;        
        if (digit == '3' || digit == '4'|| digit == '8' || digit == '9') sum += 8;
        if (digit == '7') sum += 9;        
      }
      if (i % 100 >= 20) {
        //find 10s digit for non teen numbers
        char digit = num.charAt(num.length() - 2);
        if (digit == '4' || digit == '5' || digit == '6') sum += 5;        
        if (digit == '2' || digit == '3' || digit == '8' || digit == '9') sum += 6;        
        if (digit == '7') sum += 7;        
      }
      if (i >= 100 && i % 100 != 0) {
        //find 100s digit
        char digit = num.charAt(num.length() - 3);
        //include "hundred and"
        if (digit == '1' || digit == '2' || digit == '6') sum += 13;        
        if (digit == '4' || digit == '5' || digit == '9') sum += 14;        
        if (digit == '3' || digit == '7' || digit == '8') sum += 15;        
      }
      if (i >= 100 && i % 100 == 0) {
        char digit = num.charAt(num.length() - 3);
        //include "hundred" but no "and"
        if (digit == '1' || digit == '2' || digit == '6') sum += 10;        
        if (digit == '4' || digit == '5' || digit == '9') sum += 11;        
        if (digit == '3' || digit == '7' || digit == '8') sum += 12;        
        if (i >= 1000) {
          //add "one thousandsum += 11;        
        }
      }
    }
    System.out.println(sum);
  }
}

