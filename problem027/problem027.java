// Euler discovered the remarkable quadratic formula:
// 
// n^2 + n + 41
// 
// It turns out that the formula will produce 40 primes for the consecutive
// values n = 0 to 39. However, when n = 40, 402 + 40 + 41 = 40(40 + 1) + 41
// is divisible by 41, and certainly when n = 41, 41² + 41 + 41 is clearly
// divisible by 41.
// 
// The incredible formula  n² − 79n + 1601 was discovered, which produces 80
//  primes for the consecutive values n = 0 to 79. The product of the
//  coefficients, −79 and 1601, is −126479.
// 
// Considering quadratics of the form:
// 
// n² + an + b, where |a| < 1000 and |b| < 1000
// 
// where |n| is the modulus/absolute value of n
// 
// e.g. |11| = 11 and |−4| = 4
// 
// Find the product of the coefficients, a and b, for the quadratic expression
// that produces the maximum number of primes for consecutive values of n,
// starting with n = 0.

class problem027 {
  public static boolean isPrime(int num) {
    num = Math.abs(num);
    boolean result = true;
    for (int i = 2; i < Math.sqrt(num) + 1; i++) {
      if (num % i == 0) {
        result = false;
        break;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int maxCount = 0;
    int result = 0;
    for (int a = -999; a < 1000; a++) {
      for (int b = -999; b < 1000; b++) {
        int n = 0;
        while (isPrime(n * n + a * n + b)) {
          n++;
        }
        if (n > maxCount) {
          maxCount = n;
          result = a * b;
        }
      }
    }
    System.out.println(result);
  }
}
