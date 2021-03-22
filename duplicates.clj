(ns duplicates
  (:require [clojure.string :as string]))

(def text (slurp "ord.txt"))

(def words
  (string/split text #"\s+"))
