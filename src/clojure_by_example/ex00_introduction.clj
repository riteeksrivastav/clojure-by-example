(ns clojure-by-example.ex00-introduction)

;; Clojure is a "Lisp"
;; - Clojure code is composed of "expressions"


;; These "literal" values are Clojure "expressions"

"hello"                                 ; strings
:hello                                  ; keywords
'hello                                  ; symbols
42                                      ; numbers
22/7                                    ; fractional numbers


;; "Built-in" functions are also "expressions"

+                                       ; addition
map                                     ; map over a collection
filter                                  ; filter from a collection
reduce                                  ; transform a collection


;; Collection "literals" are expressions too:

[1 2 3 4 5]                             ; a vector
{:a 1 :b 2}                             ; a hash-map
#{1 2 3 4 5}                            ; a hash-set
'(1 2 3 4 5)                            ; a list


;; Clojure code is also an expression; a "symbolic" expression:

(+ 1 2)

(+ (+ 1 2) (+ 1 2))

(+ (+ (+ 1 2) (+ 1 2))
   (+ (+ 1 2) (+ 1 2)))


;; In fact, ALL Clojure code is just "expressions"
;; - And, all Clojure expressions evaluate to a value.


;; DEMO: Clojure expression syntax rules:
;;
;; - Literals:


;; - Collection Literals:


;; - "s-expressions":



;; DEMO: Clojure Code Evaluation Rules

(+ 1 2)

(+ (+ 1 2) (+ 1 2))

(+ (+ (+ 1 2) (+ 1 2))
   (+ (+ 1 2) (+ 1 2)))


;; - To prevent evaluation
'(1 2)

'(+ 1 2)

; (1 2)


;; Compare this:
#_(+ 1 2
     3 4
     5 6)

;; With this:
;; (+ 1 2
;;    3 4
;;    5 6)



;; DEMO: Why is Clojure a "List Processing" language?

'(+ 1 2) ; list of expressions

(+ 1 2)  ; executable s-expression


;; Here is a function definition.

(defn hie
  [person message]
  (str "Hie, " person " : " message))


;; What does it look like?
'(defn hie  [person message] (str "Hie, " person " : " message))
