(defproject timbre-hikari-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [hikari-cp "1.8.2"]
                 [org.postgresql/postgresql "42.0.0"]
                 [org.slf4j/log4j-over-slf4j "1.7.25"]
                 [org.slf4j/slf4j-api "1.7.25"]
                 [com.fzakaria/slf4j-timbre "0.3.7"]
                 [com.taoensso/timbre "4.10.0"]]
  :main ^:skip-aot timbre-hikari-demo.core
  :plugins [[lein-postgres "0.1.1"]]
  :postgres {:port 12345
             :clean-data-directory true
             :data-directory "/tmp/embeddedpostgres"
             :server-config {:max_connections "300"}}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
