// Largest Palindrome Project
// 
// A palindromic number reads the same both ways. The largest palindrome 
// made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
// Find the largest palindrome made from the product of two 3-digit numbers.

int highest_palindrome = 0;
int i, j, k, num;
char buf[6];
for (i = 0; i < 1000; i++) {
    for (j = i; j < 1000; j++) {
        num = i * j;
        for (k = 0; k < 6; k--, num /= 10) {
            buf[k] = num[5 - k];
        }
    }
}