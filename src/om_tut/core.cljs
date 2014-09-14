(ns om-tut.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(enable-console-print!)

;(def app-state (atom {:text "Hello world!!111111111!!"}))

(def app-state (atom {:list ["Lion" "Zebra" "Buffalo" "Antelope"]}))

(om/root
  (fn [app owner]
    (om/component
      (apply dom/ul #js {:className "animals"}
             (map (fn [text] (dom/li nil text)) (:list app)))))
  app-state
  {:target (. js/document (getElementById "app"))})

