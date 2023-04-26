(ns hello
  (:require [hello-time :as ht]))

(defn run [opts]
  (println "Oi! A hora é:" (ht/time-str (ht/now))))
