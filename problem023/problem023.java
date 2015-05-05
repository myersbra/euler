// Non-Abundant Sums
// 
// A perfect number is a number for which the sum of its proper divisors
// is exactly equal to the number. For example, the sum of the proper
// divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 
// 28 is a perfect number.
// 
// A number n is called deficient if the sum of its proper divisors is
// less than n and it is called abundant if this sum exceeds n.
// 
// As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the
// smallest number that can be written as the sum of two abundant numbers
// is 24. By mathematical analysis, it can be shown that all integers
// greater than 28123 can be written as the sum of two abundant numbers.
// However, this upper limit cannot be reduced any further by analysis
// even though it is known that the greatest number that cannot be
// expressed as the sum of two abundant numbers is less than this limit.
// 
// Find the sum of all the positive integers which cannot be written as
// the sum of two abundant numbers.

import java.io.*;
import java.util.*;

class problem023 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    List<Integer> newList = new ArrayList<>();
    for (int i = 1; i < 28124; i++) {      
      newList.add(i);
      int sum = 0;
      for (int j = 1; j < Math.ceil(Math.sqrt(i)); j++) {
        if (i % j == 0) {
          sum += j;
          sum += i / j;
        }
      }
      if (Math.sqrt(i) % 1 == 0.0) {
        sum += Math.sqrt(i); // to ensure root is counted
      }
      sum -= i; // to remove the complement of 1 (1 * i = i, so i will be included in the sum at this point)
      if (sum > i) {
        list.add(i);
      }
    }
    
    List<Boolean> trueList = new ArrayList<>();
    for (int i = 0; i < 28124; i++) {      
      trueList.add(false);
    }

    for (int b = 0; b < list.size(); b++) {      
      for (int c = b; c < list.size(); c++) {
        if (list.get(b) + list.get(c) < 28124) {
          trueList.set(list.get(b) + list.get(c), true);
        } else {
          break;
        }
      }
    }

    int sum = 0;
    for (int k = 0; k < 28124; k++) {
      if (trueList.get(k) == false) {
        sum += k;
      }
    }
    System.out.println(sum);
  }
}