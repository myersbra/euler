// 10001st Prime
// 
// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
// we can see that the 6th prime is 13.
// 
// What is the 10 001st prime number?

class problem007 {
  public static void main(String[] args) {
    int result = 2, counter = 1;
    boolean isPrime;
    while (counter < 10001) {
      isPrime = true; // assume until proven false
      result++;
      for (int i = 2; i <= (int) Math.sqrt((double)result); i++) {
        if (result % i == 0) isPrime = false;
      }
      if (isPrime) counter++;
    }
    System.out.println(result);
  }
}
