// Largest Product in a Series
// 
// Find the greatest product of five consecutive digits
// in the 1000-digit number in problem008.txt

import java.io.*;
import java.util.*;

class problem008 {
	public static void main(String[] args) {
		try {
			// read file into Integer List
			BufferedReader br = new BufferedReader(new FileReader("problem008.txt"));
			List<Integer> intList = new ArrayList<>();
			String line;
			while ((line = br.readLine()) != null) {
				for (int i = 0; i < line.length(); i++) {
					intList.add(Character.getNumericValue(line.charAt(i)));
				}
			}

			// check all consecutive 5-digit combinations
			int largestProduct = 0;
			for (int i = 0; i < intList.size() - 5; i++) {
			  int product = intList.get(i);
			  for (int j = i + 1; j < i + 5; j++) {
			    product *= intList.get(j);
			    if (product > largestProduct) largestProduct = product;
			  }
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