import Dependencies._
import Commons._

name := """$name$"""

lazy val common = project.
  enablePlugins(BuildInfoPlugin, PlayJava).
  settings(buildInfoSettings).
  settings(commonSettings).
  settings(libraryDependencies ++= commonDependencies)

lazy val $module1$ = project.
  enablePlugins(BuildInfoPlugin, PlayJava).
  settings(buildInfoSettings).
  settings(commonSettings).
  settings(libraryDependencies ++= $module1$Dependencies).
  dependsOn(common)

lazy val $module2$ = project.
  enablePlugins(BuildInfoPlugin, PlayJava).
  settings(buildInfoSettings).
  settings(commonSettings).
  settings(libraryDependencies ++= $module2$Dependencies).
  dependsOn(common)

lazy val root = project in file(".")

