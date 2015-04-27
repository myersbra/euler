// Special Pythagorean Triplet
// 
// A Pythagorean triplet is a set of three natural numbers,
// a < b < c, for which, a^2 + b^2 = c^2
// 
// For example, 32 + 42 = 9 + 16 = 25 = 52.
// 
// There exists exactly one Pythagorean triplet for which 
// a + b + c = 1000. Find the product abc.

class problem009 {
  public static void main(String[] args) {
    int result = 0;
    for (int a = 0; a < 1000; a++) {
      for (int b = a + 1; b < 1001; b++) {
        double c = Math.sqrt(a * a + b * b);
        if (a + b + c == 1000.0 && b < c) {
          result = (int) (a * b * c);
        }
      }
    }
    System.out.println(result);
  }
}