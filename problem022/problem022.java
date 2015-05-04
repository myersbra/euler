// Names Scores
// 
// Using names.txt (right click and 'Save Link/Target As...'),
// a 46K text file containing over five-thousand first names,
// begin by sorting it into alphabetical order. Then working out
// the alphabetical value for each name, multiply this value by
// its alphabetical position in the list to obtain a name score.
// 
// For example, when the list is sorted into alphabetical order,
// COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th
// name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
// 
// What is the total of all the name scores in the file?

import java.io.*;
import java.util.*;

class problem022 {
  public static void main(String[] args) {
    try {
      Scanner s = new Scanner(new File("names.txt"));
      List<String> list = new ArrayList<>();
      while (s.hasNextLine()) {
        String line = s.nextLine();
        Scanner s2 = new Scanner(line);
        s2.useDelimiter("\",\"|\"");
        while (s2.hasNext()) {
          list.add(s2.next());
        }
        s2.close();
      }
      s.close();

      Collections.sort(list);     
      int totalSum = 0;
      for (String i : list) {
        int sum = 0;
        for (int j = 0; j < i.length(); j++) {
          sum += i.charAt(j) - 'A' + 1;
        }
        totalSum += (list.indexOf(i) + 1) * sum;
      }
      System.out.println(totalSum);
    }
    catch (FileNotFoundException e) {
      System.out.println(e);
    }
  }
}