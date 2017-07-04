name := """ExampleHerokuCircleCI"""
organization := "co.edu.unibague.tutorial.herokuCircle"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies += guice
