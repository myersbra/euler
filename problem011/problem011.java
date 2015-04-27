// Largest Product in a Grid
// 
// In the 20×20 grid in problem011.txt, four numbers
// along a diagonal line have been marked in red.
// 
// The product of these numbers is 26 × 63 × 78 × 14 = 1788696.
// 
// What is the greatest product of four adjacent numbers in the same
// direction (up, down, left, right, or diagonally) in the 20×20 grid?

import java.io.*;
import java.util.*;

class problem011 {
  public static void main(String[] args) {
    try {
      // read file into 2D Integer list
      Scanner s = new Scanner(new File("problem011.txt"));
      List<List<Integer>> list = new ArrayList<>();
      while (s.hasNextLine()) {
        List<Integer> element = new ArrayList<>();
        String line = s.nextLine();
        Scanner s2 = new Scanner(line);
        s2.useDelimiter(" ");
        while (s2.hasNextInt()) {
          element.add(s2.nextInt());
        }
        s2.close();
        list.add(element);
      }
      s.close();

      int largestProduct = 0;

      //check horizontal products
      for (int y = 0; y < 20; y++) {
        for (int x = 0; x < 20 - 3; x++) {
          int product = list.get(y).get(x);
          for (int i = x + 1; i < x + 4; i++) {
            product *= list.get(y).get(i);
          if (product > largestProduct) {
            largestProduct = product;
          }
          }
        }
      }

      //check vertical products
      for (int x = 0; x < 20; x++) {
        for (int y = 0; y < 20 - 3; y++) {
          int product = list.get(y).get(x);
          for (int i = y + 1; i < y + 4; i++) {
            product *= list.get(i).get(x);
          if (product > largestProduct) {
            largestProduct = product;
          }
          }
        }
      }

      //check diagonal products
      for (int y = 0; y < 20 - 3; y++) {
        for (int x = 0; x < 20 - 3; x++) {
          int product = list.get(y).get(x);
          for (int i = 1; i < 4; i++) {
            product *= list.get(y + i).get(x + i);
          if (product > largestProduct) {
            largestProduct = product;
          }
          }
        }
      }

      for (int y = 0 + 3; y < 20; y++) {
        for (int x = 0; x < 20 - 3; x++) {
          int product = list.get(y).get(x);
          for (int i = 1; i < 4; i++) {
            product *= list.get(y - i).get(x + i);
          if (product > largestProduct) {
            largestProduct = product;
          }
          }
        }
      }

      System.out.println(largestProduct);
    }
    catch (FileNotFoundException e) {
      System.out.println(e);
    }
  }
}
