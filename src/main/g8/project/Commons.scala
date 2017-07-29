import sbt._
import Keys._
import sbtbuildinfo.BuildInfoPlugin.autoImport.{BuildInfoKey, buildInfoKeys, buildInfoPackage}


object Commons {

  val buildInfoSettings : Seq[Def.Setting[_]] = Seq(
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "buildinfo"
  )


  val commonSettings: Seq[Def.Setting[_]] = Seq(
    scalaVersion:= "2.11.10 ",
    version      := "0.1.0-SNAPSHOT",
    organization := """$organization$"""
  )


}