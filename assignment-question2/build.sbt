name := "demonstrating-multi-modules"
version := "1.0.0"
scalaVersion := "2.12.4"

lazy val utils = project
  .settings(
    name := "utils"
    )

lazy val welcome = project
  .settings(
    name := "welcome-impl",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test"
    )
  .dependsOn(
    utils
  )

lazy val root = project
  .in(file("."))
  .aggregate(
    utils,
    welcome
  )
