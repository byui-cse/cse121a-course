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


;;
;;A function to exercise a series of familiarization uses of mathematical operators,
;;
(defn exercise-math []
    (def x 3)
    (def y 5)
    (def z 7)
    (println (+ x y z))
    (println (* x y z))
    (println (/ x y z))
    (println (+ (Math/pow x 2) (* y 3) z))
    (println (+ (Math/pow z x) (Math/pow x z)))
    (println (+ (/ z y) x))
    (println (inc (* x y z)))
    ;;I have not used println here so the 'ok' value 
    ;;of println is not displayed in the REPL.
    ;;The value of the line of code below is displayed instead.
    (dec (* x y z)))

;;
;;A function to exercise a series of familiarization uses of logical operators,
;;
(defn exercise-logic []
				(def a 13)
				(def b 17)
				(def c 23)
				(println (> a b))
				(println (> b a))
				(println (< a b))
				(println (< b c))
				(println (>= c c))
				(println (= a c))
				(println (<= a b))
				(println (and (< a b) (> b c)))
				;;I have not used println here so the 'ok' value 
    ;;of println is not displayed in the REPL.
    ;;The value of the line of code below is displayed instead.
				(or (< a b) (> b c))
)
