#include <stdio.h>

int main() {
  int i = 0, result = 0;
  for (; i < 1000; i++) {
    if (i % 3 == 0 || i % 5 == 0) {
      result += i;
    }
  }
  printf("%d\n", result);
}
