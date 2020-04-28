name := "test-sbt-project"

version := "0.1"

scalaVersion := "2.12.6"

resolvers += "kyivstar repo" at "http://cpa-whg-mon1.kyivstar.ua:8082/artifactory/virtual"

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.3.2"
)
