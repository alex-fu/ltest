name := "ltest"
organization := "com.github.lhjhust"
scalaVersion := "2.11.8"

libraryDependencies ++= {
  val akkaV       = "2.4.14"
  val akkaHttpV   = "10.0.0"
  val scalaTestV  = "3.0.1"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV % "provided",
    "com.typesafe.akka" %% "akka-stream" % akkaV % "provided",
    "com.typesafe.akka" %% "akka-testkit" % akkaV % "provided",
    "com.typesafe.akka" %% "akka-http" % akkaHttpV % "provided",
    "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpV % "provided",
    "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpV % "provided",
    "org.scalatest"     %% "scalatest" % scalaTestV % "test",
    "com.typesafe.scala-logging" % "scala-logging_2.11" % "3.1.0",
    "org.apache.spark"  %% "spark-mllib" % "2.0.2" % "provided"
  )
}

