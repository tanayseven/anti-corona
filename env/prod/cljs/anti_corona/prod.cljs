(ns anti-corona.prod
  (:require [anti-corona.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
