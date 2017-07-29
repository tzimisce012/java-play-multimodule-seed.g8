import sbt._
import Keys._

object Dependencies {

  lazy val scalaTestPlay = "org.scalatestplus.play" %% "scalatestplus-play" % "3.0.0"
  lazy val logBackJson = "ch.qos.logback.contrib" % "logback-json-classic" % "0.1.5"
  lazy val logBackJackson = "ch.qos.logback.contrib" % "logback-jackson" % "0.1.5"

  val commonDependencies: Seq[ModuleID] = Seq(
    logBackJson,
    logBackJackson,
    scalaTestPlay % Test
  )


  val $module1$Dependencies: Seq[ModuleID] = commonDependencies
  val $module2$Dependencies: Seq[ModuleID] = commonDependencies


}