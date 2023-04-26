(ns rotas
    (:require [ring.adapter.jetty :as jetty]))

(defn a-handler [request]
    {:status 200
     :body "Ok... a-handler aqui\n"})

(defn b-handler [request]
    {:status 200
     :body "Ok... B-handler aqui\n"})

(defn handler [request]
    (case (:uri request)
    "/a" (a-handler request)
    "/b" (b-handler request)))

(defn run [args]
    (jetty/run-jetty (var handler) {:port 5000 :join? false})
    (println "servidor no ar!"))
