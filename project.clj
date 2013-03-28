(defproject drive "0.1.0-SNAPSHOT"
  :description "Explore Google APIs"
  :url "https://github.com/tbl3rd/googolplex.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies
  [[org.clojure/clojure "1.5.1"]
   [com.google.api-client/google-api-client "1.12.0-beta"]
   [com.google.apis/google-api-services-calendar "v3-rev34-1.14.1-beta"]
   [com.google.apis/google-api-services-discovery "v1-rev19-1.14.1-beta"]
   [com.google.apis/google-api-services-drive "v2-rev62-1.14.1-beta"]
   [com.google.apis/google-api-services-oauth2 "v2-rev32-1.14.1-beta"]
   [com.google.apis/google-api-services-plus "v1-rev61-1.14.1-beta"]
   [com.google.apis/google-api-services-translate "v2-rev10-1.14.1-beta"]
   [com.google.http-client/google-http-client-jackson2 "1.12.0-beta"]]
  :repositories
  {"google-api-services"
   "http://google-api-client-libraries.appspot.com/mavenrepo"})
