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


(defn gcd [a b]
    (if (zero? b)
      a
      (recur b (mod a b))))

(defn gcd-instrumented [a b]
  (if (zero? b)
    a
    (do
     (println a '= b (list (quot a b)) '+ (rem a b))
     (recur b (mod a b)))))

;The function used to exercise each of the GCD function versions.
(defn exercise []
  (gcd 234 66)

  (gcd-instrumented 234 66)

;Execute the exercise function
(exercise)