;;; Project Euler - Problem 3
;;;
;;; The prime factors of 13195 are 5, 7, 13 and 29.
;;;
;;; What is the largest prime factor of the number 600851475143?

(define (sum input primeFactor highestPrimeFactor)
  (if (< highestPrimeFactor input)
      (if (= (modulo input primeFactor) 0)
           (if (> primeFactor highestPrimeFactor)
               (sum (floor (/ input primefactor)) 2 primeFactor) 
               (sum input (+ 1 primeFactor) highestPrimeFactor))
           (sum input (+ 1 primeFactor) highestPrimeFactor))
      highestPrimeFactor))

(sum 600851475143 2 2) 
