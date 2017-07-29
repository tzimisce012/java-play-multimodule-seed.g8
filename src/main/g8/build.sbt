import Dependencies._
import Commons._

name := """$name$"""

lazy val $module1$ = project.
  enablePlugins(BuildInfoPlugin, PlayJava).
  settings(buildInfoSettings).
  settings(commonSettings).
  settings(libraryDependencies ++= $module2$Dependencies)

lazy val $module2$ = project.
  enablePlugins(BuildInfoPlugin, PlayJava).
  settings(buildInfoSettings).
  settings(commonSettings).
  settings(libraryDependencies ++= $module2$Dependencies)

lazy val root = project in file(".")

