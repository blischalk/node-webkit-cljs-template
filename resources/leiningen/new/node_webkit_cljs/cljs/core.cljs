(ns {{namespace}}
  (:require [weasel.repl :as repl]))

(when-not (repl/alive?)
  (repl/connect "ws://localhost:9001"))

(defn init []
  (.alert js/window "Your app is working"))

;; Execute an initializer when app dom loaded
(set! (.-onload js/window) init)
