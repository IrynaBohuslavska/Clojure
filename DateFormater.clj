(ns date
  (:require [clojure.string :as string]))

(defn new-date-format [input]
  (let [date (java.util.Date. input)]
  (if (= (string/index-of input "/") 4)
    (.format
       (java.text.SimpleDateFormat. "MM/dd/yy") date)
    (.format
       (java.text.SimpleDateFormat. "yyyy/MM/dd") date))))


(new-date-format "2021/12/01")



