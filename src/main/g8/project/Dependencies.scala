import sbt._
import Keys._
import play.sbt.PlayImport.{cache, filters, javaWs}

object Dependencies {
  lazy val logBackJson = "ch.qos.logback.contrib" % "logback-json-classic" % "0.1.5"
  lazy val logBackJackson = "ch.qos.logback.contrib" % "logback-jackson" % "0.1.5"

  val commonDependencies: Seq[ModuleID] = Seq(
    logBackJson,
    logBackJackson
  )

  val playDependencies: Seq[ModuleID] = Seq(
    filters,
    javaWs,
    cache
  )


  val $module1$Dependencies: Seq[ModuleID] = commonDependencies ++ playDependencies
  val $module2$Dependencies: Seq[ModuleID] = commonDependencies ++ playDependencies


}
