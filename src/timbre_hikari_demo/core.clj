(ns timbre-hikari-demo.core
  (:require [hikari-cp.core :as h]
            [taoensso.timbre :as timbre])
  (:gen-class))

(def datasource-options {:auto-commit        true
                         :read-only          false
                         :connection-timeout 30000
                         :validation-timeout 5000
                         :idle-timeout       600000
                         :max-lifetime       1800000
                         :minimum-idle       10
                         :maximum-pool-size  10
                         :pool-name          "demo-pool"
                         :adapter            "postgresql"
                         :username           "postgres"
                         :password           "postgres"
                         :database-name      "postgres"
                         :server-name        "localhost"
                         :port-number        12345
                         :register-mbeans    false})

(defn make-datasource []
  (h/make-datasource datasource-options))

(defn -main [level]
  (do
    (timbre/merge-config! {:level (keyword level)})
    (let [datasource (make-datasource)]
      (Thread/sleep 5000)
      (timbre/debug "This is hidden")
      (Thread/sleep 1000)
      (timbre/info "This is visible")
      (Thread/sleep 10000))))
