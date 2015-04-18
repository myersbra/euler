(define (sum x y z)
  (if (< x y) (sum (+ x 1) y
                   (+ z (cond ((= (modulo x 3) 0) x)
                              ((= (modulo x 5) 0) x)
                              (else 0))))
      (display z)))

(display "\n")
(sum 1 1000 0)
