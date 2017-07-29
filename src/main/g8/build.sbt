name := """$name$"""

lazy val $module1$ = project.
  enablePlugins(PlayJava).
  settings(
    scalaVersion := "2.12.2",
    libraryDependencies += guice
  )

lazy val $module2$ = project.
  enablePlugins(PlayJava).
  settings(
    scalaVersion := "2.12.2",
    libraryDependencies += guice
  )

lazy val root = project in file(".")

