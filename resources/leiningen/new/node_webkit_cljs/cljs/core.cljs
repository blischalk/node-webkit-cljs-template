(ns {{namespace}})

(defn init []
  (.alert js/window "Your app is working"))

;; Execute an initializer when app dom loaded
(set! (.-onload js/window) init)
