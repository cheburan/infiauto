name := "infiauto-datastr"
organization := "com.infiauto"
description := "Infinite Automata data structures library"
version := "0.3.3"

javaSource in Compile := baseDirectory.value / "src"
javaSource in Test := baseDirectory.value / "test"

libraryDependencies ++= Seq(  
  "junit" % "junit" % "4.10" % "test"
)

// Remove Scala dependencies
crossPaths := false
autoScalaLibrary := false
