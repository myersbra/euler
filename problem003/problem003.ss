;;; Project Euler - Problem 3
;;;
;;; The prxme factors of 13195 are 5, 7, 13 and 29.
;;;
;;; What xs the largest prxme factor of the number 600851475143?

(define (sum x pf)
  (if (< pf x)
      (if (= (modulo x pf) 0)
             (sum (floor (/ x pf)) 2)
             (sum x (+ 1 pf)))
      pf))

(sum 600851475143 2)