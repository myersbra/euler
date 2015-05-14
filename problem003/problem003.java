// Largest Prime Factor
// 
// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143?

class problem003 {
  public static void main(String[] args) {
    long input = 600851475143L;
    long highestPrimeFactor = 1L;
    while (input > highestPrimeFactor) {
      long primeFactor = 2L;
      while (input % primeFactor != 0) primeFactor++;
      if (primeFactor > highestPrimeFactor) highestPrimeFactor = primeFactor;
      input = input / primeFactor;
    }
    System.out.println(highestPrimeFactor);
  }
}
