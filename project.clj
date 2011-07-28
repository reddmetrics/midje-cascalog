(defproject midje-cascalog "0.1.0"
  :description "Cascalog functions for Midje."
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [cascalog "1.8.0"]
                 [midje "1.2-alpha3"]]
  :dev-dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]
                     [swank-clojure "1.4.0-SNAPSHOT"]
                     [clojure-source "1.2.0"]])
