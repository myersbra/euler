;;; Largest Palindrome Project
;;; 
;;; A palindromic number reads the same both ways. The largest palindrome 
;;; made from the product of two 2-digit numbers is 9009 = 91 * 99.
;;;
;;; Find the largest palindrome made from the product of two 3-digit numbers.

(define (findlargestpalindrome start limit result)
    (if (< start limit)
        (findlargestpalindrome (+ start 1) limit (checkcombos start start limit result))
        result))

(define (checkcombos a b limit result)
    (if (< b limit)
        (checkcombos a (+ b 1) limit (greaterpalindrome (* a b) result))
        result))

(define (greaterpalindrome a b)
    (if (and (ispalindrome a) (> a b))
        a
        b))

(define (ispalindrome x)
    (= x (flip x 0)))

(define (flip num result)
    (if (= num 0)
        result
        (flip (quotient num 10)
              (+ (* result 10) (modulo num 10)))))

(findlargestpalindrome 100 1000 0)
