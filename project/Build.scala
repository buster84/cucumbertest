import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "cucumberExample"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
    "info.cukes" % "cucumber-jvm" % "1.1.4",
    "info.cukes" % "cucumber-scala_2.10" % "1.1.4",
    "info.cukes" % "cucumber-junit" % "1.1.4",
    "junit" % "junit" % "4.7"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
   
  )

}
