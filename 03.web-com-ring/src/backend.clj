(ns backend
    (:require [ring.adapter.jetty :as jetty]))

(defn handler [request]
    {:status 200
     :body "oi pela 3a vez\n"})

(defn run [args]
    (jetty/run-jetty handler {:port 5000 :join? false})
    (println "servidor iniciado"))
