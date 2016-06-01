// Smallest Multiple
// 
// 2520 is the smallest number that can be divided by each
// of the numbers from 1 to 10 without any remainder.
//
// What is the smallest positive number that is evenly
// divisible by all of the numbers from 1 to 20?

var lowerLimit = 1,
    upperLimit = 20,
    result = 0,
    isEvenlyDivisible = false

// assemble list of divisors
divisors = [];
for (var num = upperLimit/2; num < upperLimit; num++) {
    divisors.push(num)
}

while (!isEvenlyDivisible) {
    result += upperLimit;
    isEvenlyDivisible = true;
    for (var i = 0; i < divisors.length; i++) {
        if (result % divisors[i] != 0) {
            isEvenlyDivisible = false;
            break;
        }
    }
}

console.log(result)
