; put stuff in a namespace... this might be important later ;-)
(ns helloworld)

; introduce yourself :)
(defn hello [n]
  (print "Hello, " n))

(hello "master")

; factorials - #mathisfun
;   the N after the one forces us to be a bigint
(defn factorial [n]
  (if (= n 1)
    1N
    (* n (factorial (- n 1)))))

(factorial 1000)

; fizzbuzz - #icanhazjobplskthnksbye
;   Write a program that prints the numbers from 1 to 100. But for
;   multiples of three print “Fizz” instead of the number and for
;   the multiples of five print “Buzz”. For numbers which are
;   multiples of both three and five print “FizzBuzz”
(defn fizzbuzz [n]
  (cond
    (=(mod n 3) 0) "Fizz"
    (=(mod n 5) 0) "Buzz"
    :else (str n)))

; test out one number
(fizzbuzz 8)

; print out 1..100 - dont use map its lazy!
(doseq [n (range 100)]
  (println (fizzbuzz n)))

; no assignment, let is the next closet thing.  scope of
; let is its parenthesis
(let [x (factorial 7)]
  (println x))


; example of how to use map function.  called function MUST
; accept an argument as map will send it.. duh!
(defn boom [i] "x")
(map boom (range 3))

; print a list of numbers in a range - proves that we are zero indexed
(print (range 1))

; you can specify upper and lower bounds like this
(print (range 1 10))


; results in stack overflow because first sequence member is
; ZERO not 1!  fix would be to guard this in our function or
; just pass a sequence starting at 1
(map factorial (range 1))

; this works!
(map factorial (range 1 10))

