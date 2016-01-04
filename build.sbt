
libraryDependencies += "org.apache.flink" % "flink-scala" % "0.8.0"

libraryDependencies += "org.apache.flink" % "flink-streaming-scala" % "0.8.0"

libraryDependencies += "org.apache.flink" % "flink-clients" % "0.8.0"


lazy val commonSettings = Seq(
  organization := "com",
  version := "0.1.0",
  scalaVersion := "2.10.4"
)

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .settings(name := "swift-eta")

// Run options
fork in run := true
