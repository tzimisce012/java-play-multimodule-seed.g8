package main.g8.project

import sbt._

object Dependencies {
  lazy val scalaTestPlay = "org.scalatestplus.play" %% "scalatestplus-play" % "3.0.0"
  lazy val logBackJson = "ch.qos.logback.contrib" % "logback-json-classic" % "0.1.5"
  lazy val logBackJackson = "ch.qos.logback.contrib" % "logback-jackson" % "0.1.5"
}