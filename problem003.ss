;;; Project Euler - Problem 3
;;;
;;; The prime factors of 13195 are 5, 7, 13 and 29.
;;;
;;; What is the largest prime factor of the number 600851475143?

;; i   = input
;; pf  = prime factor
;; hpf = highest prime factor

(define (sum i pf hpf)
  (if (< hpf i)
      (if (= (modulo i pf) 0)
          (if (>= pf hpf)
              (sum (floor (/ i pf)) 2 pf)
              (sum (floor (/ i pf)) (+ 1 pf) hpf))
          (sum i (+ 1 pf) hpf))
      hpf))

(sum 600851475143 2 2 )
