(ns sicp.ch01.ex_1_1)

;;
;;  Exercise 1.1: Below is a sequence of expressions. What is the
;;  result printed by the interpreter in response to each expression?
;;  Assume that the sequence is to be evaluated in the order in which
;;  it is presented.

;; First present the text from the book in SCHEME
;; then in Clojure
;; => then the output

;; ======== SCHEME
;; 10

;; -------- CLOJURE
10
;;=> 10

;; ======== SCHEME
;;(+ 5 3 4)

;; -------- CLOJURE
(+ 5 3 4)
;;=> 12

;; ======== SCHEME
;;(- 9 1)

;; -------- CLOJURE
(- 9 1)
;;=> 8

;; ======== SCHEME
;;(/ 6 2)

;; -------- CLOJURE
(/ 6 2)
;;=> 3

;; ======== SCHEME
;;(+ (* 2 4) (- 4 6))

;; -------- CLOJURE
(+ (* 2 4) (- 4 6))
;;=> 6

;; ======== SCHEME
;;(define a 3)
;;(define b (+ a 1))

;; -------- CLOJURE
(def a 3)
(def b (+ a 1))
;; => #'sicp.ex01.ex_1_1/b

;; ======== SCHEME
;;(+ a b (* a b))

;; -------- CLOJURE
(+ a b (* a b))
;;=> 19

;; ======== SCHEME
;;(= a b)

;; -------- CLOJURE
(= a b)
;;=> false

;; ======== SCHEME
;;(if (and (> b a) (< b (* a b)))
;;  b
;;  a)

;; -------- CLOJURE
(if (and (> b a) (< b (* a b)))
  b
  a)
;; => 4


;; ======== SCHEME
;;(cond ((= a 4) 6)
;;      ((= b 4) (+ 6 7 a))
;;      (else 25))

;; -------- CLOJURE
(cond (= a 4) 6
      (= b 4) (+ 6 7 a)
      :else 25)

;;=> 16


;; ======== SCHEME
;;(+ 2 (if (> b a) b a))

;; -------- CLOJURE
(+ 2 (if (> b a) b a))
;;=> 6

;; ======== SCHEME
;;(* (cond ((> a b) a)
;;         ((< a b) b)
;;         (else -1))
;;   (+ a 1))

;; -------- CLOJURE
(* (cond (> a b) a
         (< a b) b
         :else -1)
   (+ a 1))

;;=> 16

