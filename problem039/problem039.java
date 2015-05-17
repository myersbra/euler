// If p is the perimeter of a right angle triangle with integral length sides,
// {a,b,c}, there are exactly three solutions for p = 120.
// 
// {20,48,52}, {24,45,51}, {30,40,50}
// 
// For which value of p ≤ 1000, is the number of solutions maximised?

import java.util.*;

class problem039 {
  public static void main(String[] args) {
    Map<Integer, Integer> tripleCounts = new HashMap<>();
    for (int a = 1; a <= 1000; a++) {
      for (int b = a; b <= 1000; b++) {
        double cDouble = Math.sqrt(a * a + b * b);
        if (cDouble % 1 != 0.0) continue;
        int c = (int) cDouble;
        int sideLengthSum = a + b + c;
        if (sideLengthSum > 1000) break;
        Integer count = tripleCounts.get(sideLengthSum);
        if (count == null) tripleCounts.put(sideLengthSum, 1);
        else tripleCounts.put(sideLengthSum, ++count);
      }
    }
    Map.Entry<Integer, Integer> maxEntry = null;
    for (Map.Entry<Integer, Integer> entry : tripleCounts.entrySet()) {
      if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) maxEntry = entry;
    }
    System.out.println(maxEntry.getKey());
  }
}
