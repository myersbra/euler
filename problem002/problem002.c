#include <stdio.h>

int main() {
  int i = 1, j = 2, k = i + j;
  int result = j;
  while (k < 4000000) {
    if (k % 2 == 0) result += k;
    i = j;
    j = k;
    k = i + j;
  }
  printf("%d\n", result);
}
