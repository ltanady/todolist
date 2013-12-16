name := "todolist"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "mysql" % "mysql-connector-java" % "5.1.27"
)

scalacOptions ++= Seq("-feature")

play.Project.playScalaSettings
