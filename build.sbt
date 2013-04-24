name := "gpp"

version := "0.1"

organization := "edu.utexas"

scalaVersion := "2.10.1"

retrieveManaged := true

crossPaths := false

resolvers ++= Seq(
  "opennlp sourceforge repo" at "http://opennlp.sourceforge.net/maven2",
  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
  "org.scalanlp" % "nak" % "1.1.2",
  "org.scalanlp" % "chalk" % "1.1.3-SNAPSHOT"
)
