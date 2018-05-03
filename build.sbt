lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion    := "2.12.2",
      // Comment out the scalac options on the next line and then the build will succeed
      scalacOptions   ++= Seq("-Ypartial-unification"),
    )),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.1"
    )
  )
