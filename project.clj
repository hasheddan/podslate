(defproject podslate "0.1.0-SNAPSHOT"
  :description "The universal podcast URL translator"
  :license {:name "APACHE LICENSE, VERSION 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot podslate.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
