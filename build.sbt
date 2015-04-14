name := "scala-reflective-utils"

organization := "com.naumen"

scalaVersion := "2.11.6"

version := "0.0.1-SNAPSHOT"

libraryDependencies += "com.thoughtworks.paranamer" % "paranamer" % "2.5.6"

libraryDependencies += "org.javassist" % "javassist" % "3.16.1-GA"

libraryDependencies += "org.specs2" %% "specs2" % "3.3.1" % "test"

scalacOptions in Test ++= Seq("-Yrangepos")

resolvers += Resolver.sonatypeRepo("releases")

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
