// Highly Divisible Triangular Number
// 
// The sequence of triangle numbers is generated by adding the natural numbers.
// So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28.
// The first ten terms would be: 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
// Let us list the factors of the first seven triangle numbers:
// 
//    1: 1
//    3: 1,3
//    6: 1,2,3,6
//   10: 1,2,5,10
//   15: 1,3,5,15
//   21: 1,3,7,21
//   28: 1,2,4,7,14,28
// 
// We can see that 28 is the first triangle number to have over five divisors.
// What is the value of the first triangle number to have over five hundred divisors?

class problem012 {
  public static void main(String[] args) {
    int numberOfFactors = 0;
    int counter = 1;
    int result = 0;
    while (numberOfFactors < 500) {
      counter++;
      result = 0;
      for (int i = 1; i < counter + 1; i++) {
        result += i;
      }
      numberOfFactors = 0;
      for (int j = 1; j < Math.ceil(Math.pow(result, 0.5)); j++) {
        if (result % j == 0) {
          numberOfFactors += 2; // including paired factor greater than the square root
        }
      }
      if (Math.pow(result, 0.5) % 1 == 0) {
        numberOfFactors++; // account for square root as factor
      }
    }
    System.out.println(result);
  }
}