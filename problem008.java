// Largest Product in a Series
// 
// Find the greatest product of five consecutive digits
// in the 1000-digit number in problem008.txt

import java.io.*;
import java.util.*;

class problem008 {
  public static void main(String[] args) {
    try {
      // read filelongo Integer List
      BufferedReader br = new BufferedReader(new FileReader("problem008.txt"));
      List<Integer> list = new ArrayList<>();
      String line;
      while ((line = br.readLine()) != null) {
        for (int i = 0; i < line.length(); i++) {
         list.add(Character.getNumericValue(line.charAt(i)));
        }
      }

      // check all consecutive 13-digit combinations
     long product = 0, largestProduct = 0;
      for (int i = 0; i < list.size() - 12; i++) {
        product = list.get(i);
        for (int j = 1; j < 13; j++) {
          product *= list.get(i + j);
        }
        if (product > largestProduct) largestProduct = product;
      }
      System.out.println(largestProduct);
    }
    catch (FileNotFoundException e) {
      System.out.println(e);
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
}
