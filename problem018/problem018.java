// Maximum Path Sum I
//
// By starting at the top of the triangle below and moving to adjacent
// numbers on the row below, the maximum total from top to bottom is 23.
// 
//    3
//   7 4
//  2 4 6
// 8 5 9 3
// 
// That is, 3 + 7 + 4 + 9 = 23.
// 
// Find the maximum total from top to bottom of the triangle in problem018.txt
// 
// NOTE: As there are only 16384 routes, it is possible to solve this problem
// by trying every route. However, Problem 67, is the same challenge with a
// triangle containing one-hundred rows; it cannot be solved by brute force,
// and requires a clever method!

import java.io.*;
import java.util.*;

class problem018 {
  public static void main(String[] args) {
    try {
      // read file into 2D Integer list
      Scanner s = new Scanner(new File("problem018.txt"));
      List<List<Integer>> array = new ArrayList<>();
      while (s.hasNextLine()) {
        List<Integer> element = new ArrayList<>();
        String line = s.nextLine();
        Scanner s2 = new Scanner(line);
        while (s2.hasNextInt()) {
          element.add(s2.nextInt());
        }
        array.add(element);
        s2.close();
      }
      s.close();

      // iterate down pyramid, summing highest parent value for each node
      for (int i = 1; i < array.size(); i++) {
        for (int j = 0; j < i + 1; j++) {
          if (j == 0) {
            array.get(i).set(j, array.get(i).get(j) + array.get(i - 1).get(0));
          }
          else if (j == i) {
            array.get(i).set(j, array.get(i).get(j) + array.get(i - 1).get(i - 1));
          }
          else {
            // determine highest parent 
            array.get(i).set(j, array.get(i).get(j)
              + Math.max(array.get(i - 1).get(j - 1), array.get(i - 1).get(j)));
          }
        }
      }
      // print highest value in bottom row
      System.out.println(Collections.max(array.get(array.size() - 1)));
    }
    catch (FileNotFoundException e) {
      System.out.println(e);
    }
  }
}
