(ns podslate.service
  (:require [io.pedestal.http :as http]
            [io.pedestal.http.route :as route]))

(defn root [request]
  {:status 200 :body "Welcome to Podslate!"})

(def routes
  (route/expand-routes
   #{["/" :get root :route-name :root]}))

(defn run
  []
  (http/create-server {:env :prod
                       ::http/routes routes
                       ::http/type :jetty
                       ::http/port 8080}))