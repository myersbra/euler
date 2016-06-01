// Largest Palindrome Project
// 
// A palindromic number reads the same both ways. The largest palindrome 
// made from the product of two 2-digit numbers is 9009 = 91 * 99.
//
// Find the largest palindrome made from the product of two 3-digit numbers.

var highestPalindrome = 0;
var result = 0;

for (var i = 100; i < 1000; i++) {
    for (var j = i; j < 1000; j++) {
        result = i * j;
        if (result === flip(result) && result > highestPalindrome) {
            highestPalindrome = result;
        }
    }
}

function flip(num) {
    var result = 0;
    while (num > 0) {
        result += (num % 10);
        num /= 10;
    }
}

console.log(highestPalindrome);