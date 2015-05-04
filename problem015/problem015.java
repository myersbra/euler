// Lattice Paths
//
// Starting in the top left corner of a 2×2 grid, and only being able to move
// to the right and down, there are exactly 6 routes to the bottom right corner.
//
// How many such routes are there through a 20×20 grid?

import java.math.BigInteger;

class problem015 {
  public static void main(String[] args) {
    int gridLength = 20;
    BigInteger[][] array = new BigInteger[gridLength + 1][gridLength + 1];
    //initialize 1s along top row and left column
    for (int i = 0; i < gridLength + 1; i++) {
        array[i][0] = BigInteger.ONE;
    }
    for (int j = 1; j < gridLength + 1; j++) {
        array[0][j] = BigInteger.ONE;
    }
    //calculate resultant values
    for (int i = 1; i < gridLength + 1; i++) {
        for (int j = 1; j < gridLength + 1; j++) {
            array[i][j] = array[i - 1][j].add(array[i][j - 1]);
        }
    }
    System.out.println(array[gridLength][gridLength].toString());
  }
}