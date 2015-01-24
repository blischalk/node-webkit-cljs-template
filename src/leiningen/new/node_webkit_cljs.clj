(ns leiningen.new.node-webkit-cljs
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files render-text]]
            [leiningen.core.main :as main]))

(def render (renderer "node-webkit-cljs"))

(defn node-webkit-cljs
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :str-name (str "\"" name "\"")
              :namespace (symbol (str name ".core"))
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' node-webkit-cljs project.")
    (->files data
      ["README.md" (render "README.md" data)]
      ["project.clj" (render "project.clj" data)]
      ["resources/public/index.html" (render "resources/public/index.html" data)]
      ["resources/public/package.json" (render "resources/public/package.json" data)]
      ["resources/public/styles.css" (render "resources/public/styles.css")]
      ["src/clj/{{sanitized}}/core.clj" (render "clj/core.clj" data)]
      ["src/cljs/{{sanitized}}/core.cljs" (render "cljs/core.cljs" data)])))
