(ns leinwartest.servlet
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use compojure.http compojure.html))

(defroutes lein-war-test-app
  (GET "/"
    (html [:h1 "Hello, World!"])))

(defservice lein-war-test-app)