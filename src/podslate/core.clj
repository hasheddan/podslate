(ns podslate.core
  (:gen-class)
  (:require [io.pedestal.http :as server]
            [podslate.service :as service]))

(defn -main
  "Server entrypoint."
  [& args]
  (println "Starting Podslate...")
  (server/start (service/run)))
