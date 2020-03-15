(ns anti-corona.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [anti-corona.core-test]))

(doo-tests 'anti-corona.core-test)
