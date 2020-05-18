(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))

(defn train
  []
  (println "Choo choo!"))

(defn rameez
  []
  (println "...is the best..."))

(def name
  "Rameez")

(defn greet
  []
  (println (str "Hi there " name)))

(def greet-properly
  []
  (println (str "As Salaamu Alaikum " name)))
