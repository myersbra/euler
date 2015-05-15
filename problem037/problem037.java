// The number 3797 has an interesting property. Being prime itself, it is
// possible to continuously remove digits from left to right, and remain
// prime at each stage: 3797, 797, 97, and 7. Similarly we can work from
// right to left: 3797, 379, 37, and 3.
// 
// Find the sum of the only eleven primes that are both truncatable from
// left to right and right to left.
// 
// NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.

class problem037 {
  public static boolean isPrime(int num) {
    boolean result;
    if (num > 1) result = true;
    else result = false;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        result = false;
        break;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int result = 0;
    for (int i = 11; i < 1000000; i++) {
      int leftHalf = i;
      int rightHalf = 0;
      if (isPrime(i)) {
        boolean truncatablyPrime = true;
        rightHalf = leftHalf % 10;
        leftHalf /= 10;
        do {
          if (!isPrime(rightHalf) || !isPrime(leftHalf)) {
            truncatablyPrime = false;
            break;
          }
          int digit = leftHalf % 10;
          int temp = (int) (digit * Math.pow(10, Integer.toString(rightHalf).length()));
          rightHalf += temp;
          leftHalf /= 10;
        }
        while (leftHalf > 0);
        if (truncatablyPrime) result += i;
      }
    }
    System.out.println(result);
  }
}
