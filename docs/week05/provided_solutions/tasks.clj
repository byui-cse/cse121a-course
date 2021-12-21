;; @author Rick Neff
;; @copyright 2020 Rick Neff licensed under the <a>
;;        rel="license"
;;        href="http://creativecommons.org/licenses/by/4.0/"
;;        target="_blank">
;;        Creative Commons Attribution 4.0 International License</a>
;;
;;
;; These solutions are not intended to be ideal solutions. Instead,
;; they are solutions that you can compare against yours to see
;; other options and to come up with even better solutions.
;;

(defn decode-prime-list
  ([elements] (decode-prime-list elements 2 nil)) ; facade clause
  ([elements counter accumulator] ; working clause
   (let [firste (first elements)
         incr (if (= firste 0) 1 firste)
         prepended-accumulator
         (if (= firste 1) ; when the first element of the list is 1
           (conj accumulator counter) ; prepend the counter to the list
           accumulator)]
     (if (empty? (rest elements)) ; if the rest of the list is empty
       (reverse prepended-accumulator) ; the list was prepended, so reverse the list to get the right order and return the result
       (recur (rest elements) (+ incr counter) prepended-accumulator))))) ; otherwise, call decode-prime-list again

(defn -main []
  (def primes '(2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97))
  (def rleprimes '(1 1 0 1 0 1 3 1 0 1 3 1 0 1 3 1 5 1 0 1 5 1 3 1 0 1 3 1 5 1 5 1 0 1 5 1 3 1 0 1 5 1 3 1 5 1 7 1 3))
  (println rleprimes)
  (println primes)
  (println (= primes (decode-prime-list rleprimes))))
