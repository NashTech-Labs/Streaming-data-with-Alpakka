ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.11"

lazy val akkaVersion = "2.6.14"
lazy val scalaTestVersion = "3.0.5"

lazy val root = (project in file("."))
  .settings(
    name := "Akka stream assignment"
  )

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.4.2",
  "com.typesafe.akka" %% "akka-stream-kafka" % "2.1.0",
  "org.scalatest" %% "scalatest" % scalaTestVersion ,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion ,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion ,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion)
