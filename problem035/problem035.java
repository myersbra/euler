// The number, 197, is called a circular prime because all rotations of the
// digits: 197, 971, and 719, are themselves prime.
// 
// There are thirteen such primes below 100:
// 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
// 
// How many circular primes are there below one million?

class problem035 {
  public static boolean isPrime(int num) {
    num = Math.abs(num);
    boolean result = true;
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
    for (int i = 2; i < 1000000; i++) {
      if (isPrime(i)) {
        boolean circular = true;
        int temp = i;
        for (int j = 0; j < Integer.toString(i).length() - 1; j++) {
          int num = temp % 10;
          temp /= 10;
          num *= Math.pow(10, Integer.toString(temp).length()); 
          temp += num;
          if (!isPrime(temp)) circular = false;
        }
        if (circular) result++;
      }
    }
    System.out.println(result);
  }
}
