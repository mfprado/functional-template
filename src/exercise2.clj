(ns exercise2)

(defn only-greater-than-five
  "Filter elements which are greater than five"
  [x]
  (filter (fn [i]
    (> i 5)) x))
