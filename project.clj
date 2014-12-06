(def tk-version "0.5.1")

(defproject puppetlabs/trapperkeeper-rpc "0.1.0-SNAPSHOT"
  :description "RPC server/client library for Trapperkeeper services"
  :url "https://github.com/puppetlabs/trapperkeeper-rpc"
  :pedantic? :abort
  :dependencies [[puppetlabs/trapperkeeper ~tk-version]
                 [puppetlabs/trapperkeeper-webserver-jetty9 "0.9.0"]]

  :lein-release {:scm         :git
                 :deploy-via  :lein-deploy}

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/clojars_jenkins_username
                                     :password :env/clojars_jenkins_password
                                     :sign-releases false}]]

  :profiles {:dev {:dependenceies [[spyscope "0.1.4"]]
                   :injections [(require 'spyscope.core)]}}
  :plugins [[lein-release "1.0.5"]])
