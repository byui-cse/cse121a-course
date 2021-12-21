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

(defn cartesian-product
      ([] '(()))
      ([xs & more]
        (mapcat #(map (partial cons %)
                      (apply cartesian-product more))
                xs)))

 (def flavors1 ["Vanilla" "Chocolate" "Cherry-Ripple"])

 (def flavors2 ["Lemon" "Butterscotch" "Licorice-Ripple"])

 (def all-flavors (concat flavors1 flavors2))

 (defn -main []
   (println "Two Lists Results: ")
   (println
     (filter
       #(= (first %) "Chocolate") ; The 1 for the parameter number indicator (%) is not needed since there is only one parameter.
       (cartesian-product flavors1 flavors2)))
   (newline)
   (println "Single List Results: ")
   (println
      (filter
        #(or (= (first %) "Chocolate") (= (last %) "Chocolate"))
       (cartesian-product all-flavors all-flavors))))

 (-main)