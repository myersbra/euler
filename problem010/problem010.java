// Summation of Primes
// 
// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
// Find the sum of all the primes below two million.

class problem010 {
  public static void main(String[] args) {
    long sum = 2;
    boolean isPrime = true;
    for (int i = 3; i < 2000000; i += 2) {
      for (int j = 2; j <= Math.sqrt(i) + 1; j++) {
        isPrime = true; // assume until proven false
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}