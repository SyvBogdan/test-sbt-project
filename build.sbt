name := "test-sbt-project"

version := "0.1"

scalaVersion := "2.12.6"

resolvers += DefaultMavenRepository


libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.3.2"
)
