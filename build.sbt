name := """playtest"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)
resolvers += "Aliyun Maven Repository" at "http://maven.aliyun.com/nexus/content/groups/public/"
externalResolvers := Resolver.withDefaultResolvers(resolvers.value, mavenCentral = false)
