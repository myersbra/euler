// In England the currency is made up of pound, £, and pence, p, and there are
// eight coins in general circulation:
// 
// 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
// It is possible to make £2 in the following way:
// 
// 1*£1 + 1*50p + 2*20p + 1*5p + 1*2p + 3*1p
// 
// How many different ways can £2 be made using any number of coins?

class problem031 {
  public static void main(String[] args) {
    int result = 0;
    int sum = 0;
    for (int a = 0; a <=1; a++) {
      for (int b = 0; b <= 2; b++) {
        for (int c = 0; c <= 4; c++) {
          for (int d = 0; d <= 10; d++) {
            for (int e = 0; e <= 20; e++) {
              for (int f = 0; f <= 40; f++) {
                for (int g = 0; g <= 100; g++) {
                  for (int h = 0; h <= 200; h++) {
                    sum = a*200 + b*100 + c*50 + d*20 + e*10 +f*5 + g*2 + h*1;
                    if (sum == 200) result++;
                    else if (sum > 200) break;
                  }
                }
              }
            }
          }
        }
      }
    }
    System.out.println(result);
  }
}
