(defproject lein-migae "0.1.7"
  :description "Leiningen plugin for migae sdk"
  :url "http://github.com/greynolds/lein-migae"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :checksum :ignore
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [leiningen "2.3.1"]
                 [org.clojure/tools.logging "0.2.3"]
                 [org.mortbay.jetty/jetty "6.1.26"]
                 [org.clojure/tools.cli "0.2.2"]
                 [stencil "0.3.2"]
                 [leinjacker "0.4.1"]
                 [lein-libdir "0.1.1"]
                 [ring "1.1.8"]
                 [ring-refresh "0.1.2"]
                 [com.google.appengine/appengine-tools-sdk "1.8.3"]]
  :eval-in-leiningen true)
