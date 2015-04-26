// Smallest Multiple
// 
// 2520 is the smallest number that can be divided by each of the
// numbers from 1 to 10 without any remainder.
// 
// What is the smallest positive number that is evenly divisible
// by all of the numbers from 1 to 20?

class problem005 {
	public static void main(String[] args) {
		int result = 0;
		boolean divides = false;
		while (!divides) {
		  result += 20;
		  divides = true;
		  for (int i = 11; i < 20; i++) {
		    if (result % i != 0) {
		      divides = false;
		      break;
		    }
		  }
		}
		System.out.println(result);
	}
}
