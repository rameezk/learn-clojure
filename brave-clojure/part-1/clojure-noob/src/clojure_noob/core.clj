(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!")
  (train))

(defn train
  []
  (println "Choo choo!"))

(defn my-thing
  [[first-thing]]
  first-thing)

(defn chooser
  [[first-choice second-choice & other-choices]]
  (println "First choice is " first-choice)
  (println "Second choice is " second-choice)
  (println "Don't care about the other choices")
  (println (str "But here they are just in case you wanna cry about them" (clojure.string/join ", " other-choices))))

(defn announce-treasure-location
  [{:keys [lat lng] :as treasure-location}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng))
  treasure-location)

(def power2 (fn [x] (* x x)))

(#(* % %) 8)

(map #(str "Hi there " % "!") ["Rameez" "Bob"])

(defn inc-maker
  "Create a custom inc maker"
  [inc-by]
  #(+ % inc-by))

(def inc4 (inc-maker 4))

(inc4 10)
